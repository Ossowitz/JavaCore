package functionalProgramming.streamApi.primitive;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55");
        strings.stream()
                .map(it -> it.concat(it))
                .map(Integer::valueOf)
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .mapToObj(Integer::valueOf);

        IntStream.range(0, 100)
                .filter(it -> it % 2 == 0)
                .forEach(System.out::println);
    }
}
