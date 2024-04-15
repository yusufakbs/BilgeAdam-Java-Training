package diamondProblem;

public interface MyInterface1 {

    public default void defaultMethod(){
        System.out.println("MyInterface1 defaultMethod");
    }

    abstract void test();
}
