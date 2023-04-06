package functionalProgramming.streamApi.primitive;

import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55");
        strings.stream()
                .map(it -> it.concat(it))
                .map(Integer::valueOf)
                .filter(i -> i % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }
}
