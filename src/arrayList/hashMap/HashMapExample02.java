package arrayList.hashMap;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer,String> languageHashMap = new HashMap<>();
        languageHashMap.put(1,"Java");
        languageHashMap.put(2,"Swift");
        languageHashMap.put(3,"C++");
        languageHashMap.put(4,"C");
        languageHashMap.put(5,"Python");

        //belirli bir keydeki değeri döndürür.
        System.out.println(languageHashMap.get(5));
        //default or get
        System.out.println(languageHashMap.getOrDefault(6,"Not found!"));
        //clone
        System.out.println(languageHashMap.clone());
        //true or false
        System.out.println(languageHashMap.containsKey(0));
        //value'ları bir set olarak dönme. -> values();
        System.out.println(languageHashMap.values());
        //key'leri bir set olarak dönme
        System.out.println(languageHashMap.keySet());
        //key/value pair (çift)'ini bir set olarak dönme
        System.out.println(languageHashMap.entrySet());
        // --
        System.out.println(languageHashMap.putIfAbsent(12,"Dart"));

        // key control
        if(languageHashMap.containsKey(2)){
            System.out.println("Map contains key value of: 2");
        }else{
            System.out.println("Not found!");
        }
        // value control
        if(languageHashMap.containsValue("Java")){
            System.out.println("Map contains value key of: 1");
        }else{
            System.out.println("Not found!");
        }

        //Bir key ile ilişkili value'yu değiştirmek. (replace())
        System.out.println("Original hashMap: " +languageHashMap);
        languageHashMap.replace(2,"GO");
        System.out.println("HashMap after replace: " +languageHashMap);

        // Bütün value değerlerini upperCase'e çevirmek. (replaceAll())
        languageHashMap.replaceAll((K,V) -> V.toUpperCase());
        System.out.println(languageHashMap);

        //Bir hashmap'ten öğeleri kaldırmak/silmek (remove())
        languageHashMap.remove(4);
        System.out.println(languageHashMap);




    }
}
