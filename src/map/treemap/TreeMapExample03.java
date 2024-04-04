package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample03 {
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

        System.out.println("Before Headmap: " + numberMap);
        Map<Integer,String> headMap = numberMap.headMap(7);
        System.out.println("\nAfter headMap(7) : " + headMap );


        Map<Integer,String> headMapWithBoolean = numberMap.headMap(7,true);
        System.out.println("\nAfter headMap(true,7) : " + headMapWithBoolean);

        System.out.println("\nBefore tailMap:" + numberMap);
        Map<Integer,String> tailMap = numberMap.tailMap(7,true);
        System.out.println("After tailmap(7) : " + tailMap);

        System.out.println("\n Before SubMap: " + numberMap);
        Map<Integer,String> subMap = numberMap.subMap(2,7);
        System.out.println("subMap: " + subMap);
        Map<Integer,String> subMapBoolean = numberMap.subMap(2,true,7,true);
        System.out.println("subMapBoolean: " + subMapBoolean);





    }
}
