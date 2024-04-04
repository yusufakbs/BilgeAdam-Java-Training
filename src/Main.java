import garbagecollector.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void finalize() {

        System.out.println("garbage ");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("a");
        Animal animal2 = new Animal("b");
        Animal animal3 = new Animal("v");
//        animal = null;
//        animal2 = null;
//        animal3 = null;
    /*
    * Bir değişkenin değeri null olarak değiştirildiği zaman garbage collector devreye girip temizleme işmeli yapar
    * */

        // manuel çağırma
        System.gc();

    }
}