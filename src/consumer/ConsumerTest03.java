package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest03 {
    public static void main(String[] args) {
        List<Double> numberList = Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0);
        //consumer kullanarak her bir sayıyı ikiye bölen işlemi uygulayalım.
        Consumer<Double> divideByTwo = number -> {
            System.out.println(number + " divided by 2 is " + (number / 2));
        };
        numberList.forEach(divideByTwo);
    }
}
