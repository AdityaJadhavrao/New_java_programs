package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class check_If_String_contains_Unique_characters {
    
    public static void main(String[] args) {
        
        String str = "programming";
        System.out.println(hasUniqueCharacters(str));
    }

    public static boolean hasUniqueCharacters(String str)
    {
        Set <Character> set = new LinkedHashSet<>();

        for(char c : str.toCharArray())
        {
            if(!set.add(c))
            {
                return false;
            }
        }
        return true;
    }
}
