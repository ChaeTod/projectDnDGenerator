package CharacterProperties;

public abstract class  Character implements CharacterProperties{
    private int age;
    private String character_name;
    private boolean character_sex;
    private String character_race;
    private String character_token;

    public Character(int age, String character_name, boolean character_sex, String character_race) {
        this.age = age;
        this.character_name = character_name;
        this.character_sex = character_sex;
        this.character_race = character_race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public boolean getCharacter_sex() {
        return character_sex;
    }

    public String getCharacter_token() {
        return character_token;
    }

    public void setCharacter_sex(boolean character_sex) {
        this.character_sex = character_sex;
    }

    public String getCharacter_race() {
        return character_race;
    }

    public void setCharacter_race(String character_race) {
        this.character_race = character_race;
    }

    public void setCharacter_token(String character_token) {
        this.character_token = character_token;
    }

    @Override
    public double calculate_health() {
        int min = 0;
        int max = 0;
        double basicHealth = 0;
        if (!getCharacter_sex()){
            min = 2;
            max = 25;
            return basicHealth = (min * Math.random() + max) / (getAge() / 100);
        } else {
            min = 5;
            max = 50;
            return basicHealth = min * Math.random() + max;
        }
    }

    @Override
    public double calculate_basicDamage() {
        double min = 0;
        double max = 0;
        double basicHealth = 0;
        if (!getCharacter_sex()){
            min = 1.2;
            max = 15;
            return basicHealth = (min * Math.random() + max) - getAge();
        } else {
            min = 1.7;
            max = 25;
            return basicHealth = (min * Math.random() + max) - getAge();
        }
    }
}
