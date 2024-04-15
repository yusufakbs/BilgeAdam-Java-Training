package function;

import java.util.function.Function;

public class FunctionTest02 {
    public static void main(String[] args) {
        Function<String,Integer> f1 = str -> Integer.parseInt(str);
        Function<String,Integer> f2 = Integer::parseInt;
        int a = f1.apply("1212");
        int b = f1.apply("11");
        System.out.println(a + " , " + b);

        Function<Integer,Integer> f3 = Math::abs;
        Function<Integer,Integer> f4 = x -> Math.abs(x);
        System.out.println(f3.apply(-5125));

    }
}
