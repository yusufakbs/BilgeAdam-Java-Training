package exception.suppressedexception;

import java.io.IOException;

public class Computer implements AutoCloseable{
    public void run(){
        System.out.println("computer is running..");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Shuw down...");
        throw new IllegalStateException("Exception is closed!");
    }
}
