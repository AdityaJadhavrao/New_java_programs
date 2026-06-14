package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertingListIntoArray {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        Object[] array = list.toArray();
        Object[] array1 = list2.toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }
}
