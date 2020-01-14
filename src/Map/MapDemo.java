package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo{
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        // insert
        testMap.put("Hello","Xin Chao");
        testMap.put("Thanks","Cam On");
        testMap.put("Goodbye","Tam biet");
        testMap.put("Hello","Xin Chao cac ban");
        // display
        for (String key:testMap.keySet()){
            System.out.println("Key :" + key);
            System.out.println("Value:" + testMap.get(key));
        }
        System.out.println("------");

        // lay value khong qua key
        for (String value:testMap.values()){
            System.out.println(value);
        }

        System.out.println("------");
        System.out.println(testMap);

        System.out.println("------");
        // duyet ca entry
        for (Map.Entry<String,String> entryvalue : testMap.entrySet()){
            System.out.println(entryvalue.getKey() + " -->" + entryvalue.getValue());
        }
        System.out.println("------");
        // iterator
        Iterator iterator = testMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
