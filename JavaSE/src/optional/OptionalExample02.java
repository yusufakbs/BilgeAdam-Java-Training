package optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.ofNullable(null);
        //nullStr = Optional.empty();
        System.out.println(nullStr);
        nullStr = Optional.of("yusuf");
        nullStr.ifPresent(e -> System.out.println(e.toUpperCase()));
        nullStr = Optional.empty();
        nullStr.ifPresent(e -> System.out.println(e.toLowerCase()));

        System.out.println(findNameById(1L).get().toUpperCase());
        System.out.println(findNameById2(1L));
        findNameById(2L).ifPresentOrElse(s -> System.out.println("Merhaba " + s) , () -> System.out.println("Üzgünüm değer bulunamadı."));

        Optional<String> nullStr2 = Optional.ofNullable(null); // Optional.empty

        System.out.println(nullStr2.map(String::length).orElse(-1));
        System.out.println(nullStr2.map(String::length).orElseThrow(RuntimeException::new));

    }

    public static Optional<String> findNameById(Long id){
        String name = null;
        if(id ==1){
            name = "Alperen";
        }
        return Optional.ofNullable(name);
    }

    public static Optional<String> findNameById2(Long id){
        String name = null;
        if(id ==1){
            name = "Alperen";
        }
        return Optional.ofNullable(name);
    }



}
