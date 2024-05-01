package generic;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        GenericClass<String> stringObj = new GenericClass<>("Java programming");
        System.out.println("Generic Class returns: " + stringObj.getData());

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello world!");
        String message = stringBox.getItem();
        System.out.println("Message: " + message);

        Box<Integer> intBox = new Box<>();
        intBox.addItem(5);
        int item = intBox.getItem();
        System.out.println("Item : " + item);











    }
}
