package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {
        TreeMap<Integer, String> numberMap = new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(4,"four");
        numberMap.put(2,"two");
        numberMap.put(7,"seven");
        numberMap.put(11,"eleven");
        numberMap.put(6,"six");
        numberMap.put(0,"zero");
        numberMap.put(5,"five");

        System.out.println(numberMap);

        System.out.println("\nHigher");
        System.out.println(numberMap.higherKey(5));
        System.out.println(numberMap.higherEntry(5));

        System.out.println("\nLower");
        System.out.println(numberMap.lowerKey(5));
        System.out.println(numberMap.lowerEntry(5));

        System.out.println("\nCeiling Function");
        System.out.println("ceilingEntry(4): " + numberMap.ceilingEntry(4));
        System.out.println("ceilingKey(5): " + numberMap.ceilingKey(5));
        System.out.println("ceilingEntry(5): " + numberMap.ceilingEntry(5));

        System.out.println("\nFloor Function");
        System.out.println("floorEntry(5) : " + numberMap.floorEntry(5));
        System.out.println("floorKey(5) : " + numberMap.floorEntry(4));

        System.out.println("\nBefore poll methods:" + numberMap);

        Map.Entry<Integer,String> removedFirstEntry = numberMap.pollFirstEntry();
        System.out.println("\nAfter pollFirstEntry()" + numberMap);
        System.out.println("Removed Entry: " + removedFirstEntry);

        Map.Entry<Integer,String> removedLastntry = numberMap.pollLastEntry();
        System.out.println("\nAfter pollFirstEntry()" + numberMap);
        System.out.println("Removed Entry: " + removedLastntry);




    }
}
