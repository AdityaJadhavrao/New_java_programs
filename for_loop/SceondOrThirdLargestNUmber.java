package for_loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SceondOrThirdLargestNUmber {
    
    public static void main(String[] args) {
        
       int arr[] = {1,2,3,4,5,6};
       Set<Integer> set = new LinkedHashSet<>();
       
       for(int num : arr)
       {
           set.add(num);
       }
       
       List<Integer> list = new ArrayList<>(set);
       
       Collections.sort(list);
       
       System.out.println("Third largest number is :"+list.get(list.size()-3));
    
    }
}
