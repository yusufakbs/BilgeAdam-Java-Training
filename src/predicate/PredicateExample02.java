package predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample02 {
    public static void main(String[] args) {

        List<String> list = List.of("java","jandarma","jakamen","solution","class");
        Stream<String> myStream = list.stream();
        Predicate<String> predicate = element -> element.length() > 5;
        myStream.filter(predicate).forEach(System.out::println);

    }
}
