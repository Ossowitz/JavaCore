package functionalProgramming.streamApi.mapReduce;

import java.util.stream.Stream;

public class MapReduceExample {

    public static void main(String[] args) {
        Stream.of(
                        new Student(18, "Ivan"),
                        new Student(13, "Peter"),
                        new Student(16, "Ivan"),
                        new Student(101, "Sveta"),
                        new Student(14, "Den"),
                        new Student(36, "Ilya"),
                        new Student(29, "John")
                )
                .sequential()
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);
    }
}
