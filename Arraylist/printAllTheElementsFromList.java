package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class printAllTheElementsFromList {
    
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(30);

        
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<num.size();i++)
        {
            int a = num.get(i);

            if(a<smallest)
            {
                smallest=a;
            }
        }
        System.out.println("smallest element is : "+smallest);
        
       
    }

}
