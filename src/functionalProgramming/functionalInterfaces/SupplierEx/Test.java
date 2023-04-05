package functionalProgramming.functionalInterfaces.SupplierEx;

import java.util.*;
import java.util.function.Supplier;

public class Test {

    public static List<Car> createThreeCars(Supplier<Car> carSupplier) {
        List<Car> cars = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }

        return cars;
    }

    public static void main(String[] args) {
        List<Car> cars = createThreeCars(() -> new Car(1, "UAZ"));
    }
}

class Car {

    private final int carId;
    private final String carName;

    public Car(int carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

}