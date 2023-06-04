package optionalTest;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        optional.ifPresent(it -> System.out.println(it.length()));
    }
}
