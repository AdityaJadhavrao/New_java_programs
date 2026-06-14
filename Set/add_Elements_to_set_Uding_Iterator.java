package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class add_Elements_to_set_Uding_Iterator {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
