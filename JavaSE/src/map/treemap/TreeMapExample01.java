package map.treemap;

import java.util.Map;
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

        numberMap.remove(1);
        for (Map.Entry<Integer,String> entry : numberMap.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--->" + value);
        }

        numberMap.putIfAbsent(3,"uc");
        System.out.println("\nentrySet() after pufIfAbsent(3,'uc') : " + numberMap.entrySet());
        System.out.println();

        numberMap.putIfAbsent(1,"bir");
        System.out.println("\nentrySet() after pufIfAbsent(1,'bir') : " + numberMap.entrySet());


        numberMap.remove(1,"one");
        System.out.println("\nentrySet() after remove(1,'one') : " + numberMap.entrySet());



        numberMap.remove(1);
        System.out.println("\nentrySet() after remove(1) : " + numberMap.entrySet());

        Integer firstKey = numberMap.firstKey();
        System.out.println("\nFirst Key: " + firstKey);
        Integer lastKey = numberMap.lastKey();
        System.out.println("\nLast Key: " + lastKey);

        Integer firstEntry = numberMap.firstEntry().getKey();
        System.out.println("\nFirst Entry: " + firstEntry);
        Integer lastEntry = numberMap.lastEntry().getKey();
        System.out.println("\nLast Entry: " + lastEntry);





    }
}
