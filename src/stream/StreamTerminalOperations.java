package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        //count() -> sonlu bir Stream'daki öğelerin sayısını belirler.
        Stream<String> s3 = Stream.of("k1","k2","k3","k4","k5");
        long countElemnt = s3.count();
        System.out.println(countElemnt);

        System.out.println("-------------");
        //min(), max() String veya Array'in minmum veya maximum değerlerini bulabilmemize imkan sağlıyor.
        Stream<String> stream01 = Stream.of("puma","lion","eagle","tiger","dog");
        Stream<String> stream02 = Stream.of("dj","lion","elephant","tiger","puma");

        Comparator<String> comp = Comparator.comparingInt(String::length);
        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);

        //değerler optional döndüğü için get() kullanman lazım.
        System.out.println(min.get() + ", " + max.get());

        String[] stringArr = "you must never lose ".split(" ");
        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());

        Comparator<String> lenghtCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lenghtCompare).get());

        //findAny() & findFirst()
        //findAny() -> Stream'deki öğelerden birini döndürür; Streamd'de hiçbir öğe yoksa boş bir Optional<T> object döndürür.
        //findFirst() Stream'deki ilk öğeyi döndürür. Hiçbir öğe yoksa Optional<T> nesnesi döndürür.
        //findFirst() akışın ilk öğelerini döndürür ancak findAny() akıştaki herhangi bir
        // öğeyi seçmekte özgürdür. (Özellikle paralel Stream kullandığımızda)
        System.out.println("-------------");
        Stream<String> s = Stream.of("monkey","cat","gorilla");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("-----------------");

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp > 0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp > 0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);

        //anyMatch(), allMatch(), noneMatch()
        List<String> list = Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 = Stream.generate(() -> "chimp");
        Stream<String> infinite02 = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        //anyMatch() -> Stream'de verilen Predicate ile eşleşen herhangi bir öğe var ise true değerini döndürür.
        //Stream boş ise veya eşleşme yok ise false değerini döndürür.
        System.out.println(list.stream().anyMatch(pred)); // true
        //allMatch() -> Yalnızca stream'deki tüm öğelerin verilen Predicate ile eşleşmesi durumunda true değerini döndürür.
        //Stream boş ise true değerini döndürür.
        System.out.println(list.stream().allMatch(pred)); // false
        //noneMatch() -> Yalnızca Stream'deki öğelerin hiçbiri verilen Predicate ile eşleşmediğinde true değerini döndürür.
        //Stream boşsa true değerini döndürüyor.
        //Sonsuz Stream'ler için sonlandırıladabilir, sonlandırılamayadabilir. (verilere bağlıdır.)
        System.out.println(list.stream().noneMatch(pred)); // false

        //infinite
        System.out.println(infinite01.anyMatch(pred)); // true
//        System.out.println(infinite01.allMatch(pred)); // true fakat -> endless loop

        System.out.println(infinite02.noneMatch(pred)); // false

        //forEach() pipeline'daki terminal işlemidir.
        Stream<String> s01 = Stream.of("Monkey","Gorilla","Chimp");
//        s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str) -> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        });

        System.out.println(list01);

        //reduce -> Akıştaki öğeler üzerinde bir işlem uygulayarak tek bir sonuç üretmek için kullanılır.

        Stream<Integer> stream = Stream.of(8,7,6);
        Stream<Integer> stream1 = Stream.of(8,7,6);

        System.out.println("Reduce :" + stream.reduce(10,(a,b) -> a * b));

        //Identity'si olmayan method Optional
        System.out.println("Reduce :" + stream1.reduce((a,b) -> a * b));

        Stream<String> streamTest = Stream.of("w1","o2","n3","a4","x5");

        String word = streamTest.reduce("X", String::concat);
        System.out.println(word);

        Stream<String> streamTest01 = Stream.of("w","o","l","f");
        String word2 = String.valueOf(streamTest01.reduce((c,d) -> c+"--"+d));
        System.out.println(word2);


        //collect()
        String frenchCounting = "un:deux:trois:quatre:un";
        List<String> gmailList = Arrays.stream(Pattern.compile(":")
                .split(frenchCounting)).collect(Collectors.toList());
        System.out.println(gmailList);
        List<String> gmailList2 = List.of(frenchCounting.split(":"));
        System.out.println(gmailList2);

        //collect(Collectors.toList())
        Set<String> gmailSet = Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toSet());
        System.out.println(gmailSet);


        //collect(Collectors.toMap())
        Map<String,Integer> nameLenght = Stream.of("Albus", "Percival", "Wulfric", "Brian", "Dumbledore")
                .collect(Collectors.toMap(name -> name,String::length));

        System.out.println(nameLenght);

        //StringBuilder();

        Stream<String> stream05 = Stream.of("w","o","l","f");
        StringBuilder word3 = stream05.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
        System.out.println(word3);

        Stream<String> stream06 = Stream.of("w","o","l","f");
        TreeSet<String> treeSet = stream06.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);







    }
}
