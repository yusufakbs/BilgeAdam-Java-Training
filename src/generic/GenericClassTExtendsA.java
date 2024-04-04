package generic;

public class GenericClassTExtendsA<T extends Number> {

    public void display(){
        System.out.println("This is a bounded type generics class.");
    }



    public static void main(String[] args) {
        GenericClassTExtendsA<Integer> test = new GenericClassTExtendsA<Integer>();

        //Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        //GenericClassTExtendsA<String> test = new GenericClassTExtendsA<String>();

    }
}
