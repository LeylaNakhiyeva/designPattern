package singleton;

public class Singleton {
    private static Singleton instance;
    String password;
    private Singleton(String password){
        this.password=password;
    }
    public static Singleton getInstance(String password){
        if (instance==null){
            instance= new Singleton(password);
        }
        return instance;
    }

}
