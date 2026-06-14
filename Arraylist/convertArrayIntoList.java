package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayIntoList {
    
    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3,4};

        List<Integer> list = Arrays.asList(arr);
        
        System.out.println(list);
    }
}
