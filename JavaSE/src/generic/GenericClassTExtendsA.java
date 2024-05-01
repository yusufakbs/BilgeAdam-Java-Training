package generic;

public class GenericClassTExtendsA<T extends Number> {

    public void display(){
        System.out.println("This is a bounded type generics class.");
    }



    public static void main(String[] args) {
        GenericClassTExtendsA<Integer> test = new GenericClassTExtendsA<Integer>();

    }
}
