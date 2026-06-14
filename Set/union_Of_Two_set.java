package Set;

import java.util.HashSet;
import java.util.Set;

public class union_Of_Two_set {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);

        set.addAll(set2);

        System.out.println(set);

    }
}


