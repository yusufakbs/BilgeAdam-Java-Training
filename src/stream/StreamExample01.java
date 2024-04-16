package stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample01 {
    public static void main(String[] args) {
        //Stream source oluşturma
        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7);

        //List'i (Ya da çoklu veri yapısını) stream'e dönüştürebilirim
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream(); //artık stream pipeline'ında.

        //Generation && Iteration
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        Stream<Integer> oddNumbers =Stream.iterate(1,n -> n + 2).limit(4);
        randoms.forEach(System.out::println);
        System.out.println("----------------------");

        oddNumbers.forEach(System.out::println);
        System.out.println("----------------------");

        //Stream pipeline flow
        Arrays.stream(Object.class.getMethods())//source
                .map(Method::getName)//intermediate operation
                .distinct()//intermediate operation
                .forEach(System.out::println); // terminal operation
        System.out.println("----------------------");

        //Range ve rangeClose
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("----------------------");
        IntStream.rangeClosed(1,5).map(e -> e*2).forEach(System.out::println);

        System.out.println("----------------------");
        //Başlangıç ve bitiş değerleri verilerek bir IntStream de oluşturabiliriz.
        IntStream.iterate(10,i -> i + 5)
                .limit(6)
                .forEach(System.out::println);



    }
}
