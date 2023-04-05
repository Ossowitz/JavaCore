package functionalProgramming.functionalInterfaces.consumerExample;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<Integer> print = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        print.accept(10);

        Consumer<Integer> display = System.out::println;
        display.accept(10);
    }
}
