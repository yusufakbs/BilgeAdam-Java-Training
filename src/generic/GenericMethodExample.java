package generic;

public class GenericMethodExample {
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7};
        Double[] doubleArray = {1.3,2.6,3.9,4.12};
        String[] stringArray = {"Apple", "Banana", "Cherry", "Pineapple", "Watermelon"};

        System.out.println("Integer array");
        printArray(intArray);

        System.out.println("String array:");
        printArray(stringArray);

        System.out.println("Double array:");
        printArray(doubleArray);
    }
}
