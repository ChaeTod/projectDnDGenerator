package CharacterProperties;

        import java.util.Collection;
        import java.util.List;
        import java.util.RandomAccess;

public class E {
    List<String> list;

    public  void setList(List<String> list){
        this.list = list;
    }

    @Override
    public String toString() {
        if (list instanceof RandomAccess){
            // do something
        } else {
            // do something
        }
    }
}
