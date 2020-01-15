package Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word: ");
        String input = sc.nextLine();
        Map<String, String> map = new HashMap<String, String>();

        map.put("Hello", "Xin Chao");
        map.put("Home", "Gia Dinh");
        map.put("car", "oto");
        map.put("phone", "dien thoai");
        map.put("computer", "may tinh");

        Dictionary diction = new Dictionary();
        diction.find(input, (HashMap<String, String>) map);
    }

    public void find(String E, HashMap<String, String> map) {
        for (String key : map.keySet()) {
            if (map.containsKey(E)) {
                System.out.println(map.get(E));
                break;
            } else {
                System.out.println("404. Not found");
                break;
            }
        }
    }
}

