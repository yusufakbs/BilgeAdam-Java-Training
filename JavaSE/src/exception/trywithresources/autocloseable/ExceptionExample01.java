package exception.trywithresources.autocloseable;

import java.io.IOException;

public class ExceptionExample01 {
    public static void main(String[] args) {
        try (Computer computer = new Computer()){
        computer.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
