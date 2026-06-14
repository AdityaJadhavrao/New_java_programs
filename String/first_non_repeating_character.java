package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class first_non_repeating_character {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character,Integer> map = new LinkedHashMap<>();
        
        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First non repeating character is : "+entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found");
    }
    
}
