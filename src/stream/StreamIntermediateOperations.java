package stream;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        //peek() - genelde hata ayıklama için kullanılır.
        Stream.of("one","two","three","four","five")
                .filter(e-> e.length() > 3)
                .peek(e -> System.out.println("Filtered valhe :" + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value : " + e))
                .collect(Collectors.toList());

        Stream.of(1,2,3,4,5)
                .peek(i -> System.out.printf("%d",i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d " , i))
                .collect(Collectors.toList());


        //filter() -> Verilen koşula uymayan elemanların kaldırılması için kullanılır. Filtreleme yapılır.
        IntStream.rangeClosed(0,10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 3)
                .forEach(System.out::println);

        //Empty Stringleri kaldırmak için filter() methodu kullanalım
        Stream.of("Yusuf","Mert","","Selami","")
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);



        // distinct() -> yinelenen (duplicate) değerlerin (value) kaldırıldığı(remove) edildiği bir string döndürür.
        Stream.of("Yusuf","Yusuf","Yusuf","Ahmet","Can","Mehmet","Yusuf","YUSUF")
                .distinct()
                .forEach(System.out::println);



        //skip() ve limit()
        //skip() -> discard işlemidir (yapılacak işleme göre n kadar başlangıç değerini atlar.). n negatif olamaz.
        //limit() -> istenen boyuttan daha uzun olmayan bir stream döndüren intermediate operation.
        Stream.iterate(10, n -> n+2)
                .skip(3)
                .limit(5)
                .forEach(System.out::println);



        //map() -> verileri dönüştürmek için kullanılır. Map interface'indeki Key, Value çifti tutan yapıyla karıştırılmamalıdır.
        Stream<String> s = Stream.of("Yusuf","Ali","Ayşe","Abuzer","Kömürcü");
        s.map(String::length).forEach(System.out::println);


        List<String> stringList = Arrays.asList("1","2","3","4","5","6");
        List<Integer> evenNumberList = stringList.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);

        //flatMap()
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)// Her iç liste için bir Stream oluşturup birleştirme.
                .collect(Collectors.toList());

        System.out.println(nestedList);
        System.out.println(flattenedList);


        //sorted() -> doğal sıralamaya göre sıralar(alfabetik).Comparable interface'inden implement edilen
        //öğeleri barındırdığı sürece efektif bir şekilde çalışır.
        //Stream<T> sorted(Comparator<? super T> comparator);
        Stream<String> s1 = Stream.of("Brown","Blue","White","Purple","bee","Alyuvar");
        s1.sorted().forEach(System.out::println);

        //Not! sorted() methodunu kullandığımızda 'Java.lang.OutOfMemoryError:Java heap space' sonucunu elde edebiliriz.
        // bu durum sorted() methodu limitten önce çağrıldığında gerçekleşir.

        Stream.generate(() -> "Luci")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);




    }


}
