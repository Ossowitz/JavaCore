package functionalProgramming.functionalInterfaces.predicateExample;

import java.awt.*;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i < 18;
            }
        };

        Predicate<Integer> betterThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i > 18;
            }
        };

        Predicate<Integer> underThan = i -> i < 18;

        Predicate<Integer> largerThan = i -> i > 18;

    }
}
