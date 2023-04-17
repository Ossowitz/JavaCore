package patternSingleton;

public class Singleton {

    private static Singleton instance;

    private String value;

    public String getValue() {
        return value;
    }

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }

        return instance;
    }

}

class SingletonExample {

    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance("Hello!");
        Singleton secondInstance = Singleton.getInstance("Bye!");

        System.out.println(firstInstance == secondInstance);

        System.out.println(firstInstance.getValue());

        System.out.println(secondInstance.getValue());
    }
}