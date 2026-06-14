package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class find_Elements_In_Set1_But_not_In_Set2 {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        set.removeAll(set2);

        for(int num : set)
        {
            System.out.println(num);
        }
    }
}
