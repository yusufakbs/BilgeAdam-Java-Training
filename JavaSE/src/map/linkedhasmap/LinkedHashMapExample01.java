package map.linkedhasmap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {
        // HashMap ile aynı özelliklere sahip.
        LinkedHashMap<String,String> mainMap = new LinkedHashMap<>();
        mainMap.put("book","kitap");
        mainMap.put("application","uygulama");
        mainMap.put("apple","elma");
        mainMap.put("mobile phone","cep telefonu");
        mainMap.put(null,null);
        mainMap.put(null,"test");
        mainMap.put("test",null);
        mainMap.put(null,"d");
        System.out.println(mainMap);


    }
}
