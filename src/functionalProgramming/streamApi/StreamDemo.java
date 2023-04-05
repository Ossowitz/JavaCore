package functionalProgramming.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        // map
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream()
                .map(x -> x * x)
                .toList();

        // filter
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .toList();

    }
}
