package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class remove_Duplicate_Elements {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,2,3,5,7,4,6,8,8};
        Set <Integer> set = new TreeSet();
       
        for(int num : a)
        {
            set.add(num);
        }
        for(int uniques : set)
        {
            System.out.print(uniques+" ");
        }
    }
}
