package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class compareTwoList {
    
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        if(list1.equals(list2))
        {
            System.out.println("Both the list are equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
