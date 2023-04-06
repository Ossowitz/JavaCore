package functionalProgramming.streamApi.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello.map(String::toUpperCase).orElse("hello");
        String orElseThrow = hello.map(String::toUpperCase).orElseThrow(IllegalAccessError::new);

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("hello"));

    }

}
