package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class remove_duplicate_character_from_String {
    
    public static void main(String[] args) {
        String str = "listen silent";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Store characters (order maintained)
        for (char ch : str.toCharArray()) {
            map.put(ch, 1); // value doesn't matter
        }

        // Build result string
        StringBuilder result = new StringBuilder();

        for (char ch : map.keySet()) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
