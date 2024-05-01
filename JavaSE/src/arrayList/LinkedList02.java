package arrayList;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        Deque<String> animalList = new LinkedList<>();
        animalList.add("Monkey");
        animalList.add("Cow");
        animalList.add("Cat");
        animalList.add("Dog");
        System.out.println(animalList);
        animalList.addFirst("Lion");
        System.out.println(animalList);
        animalList.addLast("Elephant");
        System.out.println(animalList);

        //remove
        animalList.removeFirst();
        System.out.println(animalList);
        animalList.removeLast();
        System.out.println(animalList);



    }
}
