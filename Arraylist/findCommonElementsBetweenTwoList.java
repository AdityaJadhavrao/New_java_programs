package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class findCommonElementsBetweenTwoList {
    
    public static void main(String[] args) {
        
        List<String> list = List.of("a","b","c","d");

        List<String> list2 = List.of("e","f","a","b");

        List<String> common = new ArrayList<>();

        for(String item : list)
        {
            if(list2.contains(item))
            {
                common.add(item);
            }
        }
        System.out.println("common elemnts from both the list are : "+common);
    }
}
