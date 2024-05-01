package exception.suppressedexception;

import java.io.IOException;
import java.util.Arrays;

public class ExceptionExample01 {
    public static void main(String[] args) {
        try (Computer computer = new Computer()){
        computer.run();
        int numder = 1/0;
        } catch (Exception e) {
            System.out.println("Catch block");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getSuppressed()));
        }
    }
}
