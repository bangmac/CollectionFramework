package Dictionary;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String word = scanner.nextLine();
        String[] strings = word.split("\\s");

        HashMap<String, Integer> newMap = new HashMap<>();
        putHashMap(strings,newMap);

        Set<String> key = newMap.keySet();
        for (String keys : key) {
            System.out.println(keys+"    "+newMap.get(keys));
        }

    }
    public static void putHashMap(String[] strings,HashMap<String,Integer>newMap){
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            newMap.put(strings[i], count);
        }
    }
}
