package consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {
    public static void main(String[] args) {
        //Way 1
        Consumer<Integer> consumer = x -> System.out.println(x * 2 );
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(consumer);
        //Way 2
        Consumer<Integer> consumer2 = (Integer x) -> System.out.println(x);
        Stream.of(1,2).forEach(consumer2);
        //Way 3
        Stream.of(1,2).forEach(x -> System.out.println(x + 50));
        //Way 4
        Stream.of(1,2).forEach(System.out::println);

    }
}
