package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample03 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = e -> e != null;
        Predicate<String> lenghtCheckPredicate = e -> e.length() > 5;

        Predicate<String> andPredicate = nullCheckPredicate.and(lenghtCheckPredicate);

        String temp1 = null;
        String temp2 = "java";
        String temp3 = "entryset";
        String temp4 = "generic";
        String temp5 = "ali";
        String temp6 = "hello";
        System.out.println(andPredicate.test(temp1));
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp3));
        System.out.println(andPredicate.test(temp4));
        System.out.println(andPredicate.test(temp5));
        System.out.println(andPredicate.test(temp6));

    }
}
