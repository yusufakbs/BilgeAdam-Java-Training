package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest05 {
    public static void main(String[] args) {
        Function<String,Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> incrementExact = Math::incrementExact;

        Function<String,Integer> parseIntAndIncrementExact = parseInt.andThen(incrementExact);
        Function<String, Integer> compose = incrementExact.compose(parseInt);

        Stream.of("-3","-5","25","30","-48","66","-23").map(compose).forEach(System.out::println);


        List<String> stringList = Arrays.asList("a a","b b","c c","d d");
        Function<String,String> upperCase = String::toUpperCase;
        //way 1
        stringList.stream().map(upperCase).forEach(System.out::println);
        //way 2 - bu yolda 21. satıra gerek yok. işi tek satırda bitiriyorsun.
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
