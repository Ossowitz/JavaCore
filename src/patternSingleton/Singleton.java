package patternSingleton;

public class Singleton {

    private static Singleton INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (INSTANCE == null) {
            INSTANCE = new Singleton(value);
        }

        return INSTANCE;
    }
}

class SingletonTestExample {

    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Hello!");
        Singleton second = Singleton.getInstance("Bye");

        System.out.println(first == second);

        System.out.println(first.getValue());

        System.out.println(second.getValue());
    }
}