package functionalProgramming.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> random = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        Supplier<Double> randomValue = Math::random;

    }
}
