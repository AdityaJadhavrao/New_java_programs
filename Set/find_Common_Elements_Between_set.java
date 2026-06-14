package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class find_Common_Elements_Between_set {
    
    public static void main(String[] args) {
        
        Set <Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Set <Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(3);
        set2.add(2);

        set.retainAll(set2); //keeps only those element in set which are in set2

        for(int num : set)
        {
            System.out.println(num);
        }

    }
}
