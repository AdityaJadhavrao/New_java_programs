package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class copyAllElementsFromOneLIstTOAnother {

    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
    
}
