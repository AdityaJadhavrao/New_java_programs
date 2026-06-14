package Set;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class count_Unique_Elements {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,5,6,7,2,3,3,4};

       Map<Integer, Integer> map =new LinkedHashMap<>();

       for(int num : a)
       {
        map.put(num, map.getOrDefault(num, 0)+1);
       }

       List<Integer> unique = new ArrayList<>();
       int count =0;

       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
        if(entry.getValue()==1)
        {
            unique.add(entry.getKey());
            count++;
        }
       }
       System.out.println("Unique elements are : "+unique);
       System.out.println("Count of unique elements is : "+count);
       
    }
}
