package Database;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.hateoas.mediatype.alps.Doc;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final JSONObject config = getConfig();
    private final String server_url = config.get("url").toString();
    private final int server_port = config.getInt("port");
    private final String dbname = config.get("dbname").toString();

    MongoClient mongo = new MongoClient(server_url, server_port);
    MongoDatabase db = mongo.getDatabase(dbname);

    MongoCollection <Document> collectionCharacters = db.getCollection("characters");
    MongoCollection <Document> collectionUnits = db.getCollection("units");
    MongoCollection <Document> collectionLocations = db.getCollection("locations");


    public JSONObject getConfig() {
        JSONObject config = new JSONObject();
        JSONParser parser = new JSONParser();
        try{
            JSONObject obj = (JSONObject) parser.parse(new FileReader("D:\\Study\\CharacterGen\\src\\main\\java\\Database\\config"));
            config.put("url", obj.get("url").toString());
            config.put("port", obj.get("port").toString());
            config.put("dbname", obj.get("dbname").toString());
        } catch (Exception e){
            e.printStackTrace();
        }
        return config;
    }

    public void addCharacter(JSONObject jsonObject){
        Document document = new Document();
        document.append("name", jsonObject.get("name").toString())
                .append("age", jsonObject.get("age").toString())
                .append("sex", jsonObject.get("sex").toString())
                .append("race", jsonObject.get("race").toString());
        collectionCharacters.insertOne(document);
    }

    public boolean findCharacterByLogin(String name){
        long totalRecords = collectionCharacters.countDocuments(new BsonDocument("name", new BsonString(name));



    }

}
