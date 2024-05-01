package diamondProblem;

public interface MyInterface2 {

    public default void defaultMethod(){
        System.out.println("MyInterface2 defaultMethod");
    }

    abstract void test();
}
