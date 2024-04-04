package arrayList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        // FIFO felsefesi ile çalışır (First in first out)
        Queue<String> languagesQueue = new LinkedList<>();
        languagesQueue.add("Python");
        languagesQueue.add("Java");
        languagesQueue.add("C");
        System.out.println("Linkedlist: " + languagesQueue);

        //peek() listenin ilk elemanına erişim
        String str1 = languagesQueue.peek();
        System.out.println(str1);

        //pool() eriştiği elemana önce erişip sonrasında listeden çıkarır.
        String str2 = languagesQueue.poll();
        System.out.println(str2);
        System.out.println("Linkedlist: " + languagesQueue);

        languagesQueue.offer("Swift");
        System.out.println(languagesQueue);


    }
}
