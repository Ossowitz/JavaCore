package functionalProgramming.streamApi;

import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> string = List.of("11", "22", "33", "44", "55");
        for (String s : string) {
            String value = s + s;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }

        List<String> strings = List.of("11", "22", "33", "44", "55");
        strings.stream()
                .map(it -> it.concat(it))
                .map(Integer::valueOf)
                .filter(i -> i % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

    }
}
