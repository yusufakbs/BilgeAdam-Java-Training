package consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("java");


    }
}
