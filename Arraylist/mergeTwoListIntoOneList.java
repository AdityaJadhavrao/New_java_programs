package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoListIntoOneList {
    
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        List<Object> merge = new ArrayList<>();
        merge.addAll(list1);
        merge.addAll(list2);

        System.out.println(merge);
    }
}
