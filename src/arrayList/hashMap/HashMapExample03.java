package arrayList.hashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Ankara",List.of("Polatlı","Yenimahalle","Çankaya","Keçiören"));
        hashMap.put("Mardin",List.of("Midyat","Kızıltepe","Savur"));
        hashMap.put("Test",List.of("test1","test2","test3","test4"));

        System.out.println(hashMap);
        Map<String, Map<String,List<String>>> nestedHashMap = new HashMap<>();
        nestedHashMap.put("Türkiye",hashMap);
        nestedHashMap.put("Test",hashMap);
        System.out.println(nestedHashMap);

    }
}
