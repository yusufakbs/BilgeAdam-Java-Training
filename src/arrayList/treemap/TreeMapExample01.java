package arrayList.treemap;

import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {
        TreeMap<Integer,String > numberMap = new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(4,"four");
        numberMap.put(1,"one");
        numberMap.put(7,"seven");
        System.out.println(numberMap);

        TreeMap<Integer,String > numberMap2 = new TreeMap<>();
        numberMap2.put(5,"five");
        numberMap2.put(9,"nine");

        System.out.println(numberMap2);

        numberMap.putAll(numberMap2);
        System.out.println(numberMap);




    }
}
