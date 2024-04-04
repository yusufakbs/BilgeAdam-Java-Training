package arrayList.hashMap;

import java.util.TreeMap;

public class HashMapExample05 {
    public static void main(String[] args) {
        TreeMap<String,Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Six",6);
        evenNumbers.put("Eight",8);
        evenNumbers.put("Ten",10);
        System.out.println(evenNumbers);
    }
}
