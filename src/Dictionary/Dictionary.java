package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello","Xin Chao");
        dictionary.put("Goodbye","Tam Biet");
        dictionary.put("Home","Gia Dinh");
        dictionary.put("Hello","Xin Chao cac ban");

        System.out.println(dictionary);

    }
}
