package supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

//Supplier ile LocalDate kullanımı.
//Tarihler genellikle millis tipinde tutulur.
public class SupplierTest03 {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        LocalDate date01 =LocalDate.ofEpochDay(0);
//        System.out.println(System.currentTimeMillis());
//        long millis = 1713255100106l;
//        long second = millis/1000l;
//        long minute = second/60;
//        long hour = minute/60;
//        long day = hour/24;
//        LocalDate date3 = LocalDate.ofEpochDay(day);
//        System.out.println(date3);

        Supplier<String> currentDateTime = () ->  LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now()) ;
        String localDateTimeForamtter = supplier03.get();
        System.out.println(localDateTimeForamtter);

    }

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}
