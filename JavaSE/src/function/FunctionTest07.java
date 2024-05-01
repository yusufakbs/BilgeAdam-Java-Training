package function;

import java.util.function.Function;

public class FunctionTest07 {
    /*
    Metin dizgisini alıp uzunluğunu alıp hesaplayan func.
    Uzunluğu alınan metin dizgisini alıp uzunluğun karesini hesaplayan bir function
    bu iki fonksiyonu birleştirip bir arada uygulayan function

     */
    public static void main(String[] args) {
        Function<String,Integer> stringLenght =String::length;
        Function<Integer,Integer> squareOfLenght = y ->  y*y;

        System.out.println(stringLenght.apply("yusuf"));
        System.out.println(squareOfLenght.apply(4));

        Function<String,Integer> combinedFunction = stringLenght.andThen(squareOfLenght);

        System.out.println(combinedFunction.apply("yusuf"));

    }




}
