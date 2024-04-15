package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample01 {
    public static void main(String[] args) {
        Predicate<String> predicate = element -> element.startsWith("j");
        // 1 tane parametre alaıyorsa  ve veri türünü belirlemediysek paranteze gerek yok.

        Predicate<String> predicate2 = (String element) -> element.startsWith("M");
        // veri türünü belirttiğimiz için parantez gerekti.

        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("y");
        };


        // yukarıdaki 3 predicate kullanımıda aynı anlama gelir, aynı şekilde çalışır.
        Stream.of("Java", "Alperen","Yusuf","Python","$","Yasin").filter(predicate3).forEach(System.out::println);

        List<String> list = Stream.of("java","jandarma","jakamen","solution","class").filter(predicate).collect(Collectors.toList());
        System.out.println(list);

    }
}
