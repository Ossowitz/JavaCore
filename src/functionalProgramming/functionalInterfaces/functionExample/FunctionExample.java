package functionalProgramming.functionalInterfaces.functionExample;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Double> half = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer i) {
                return i / 2.0;
            }
        };
        half.apply(10);

        Function<Integer, Double> circle = a -> a / 2.0;
        circle.apply(20);
    }
}
