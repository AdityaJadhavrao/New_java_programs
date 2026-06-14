package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class removeAllEvenNumbersFromList {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        List<Integer> odd = new ArrayList<>(List.of(10,13,16,18,19,21));

        List<Integer> odd1 = new ArrayList<>();

        for(Integer num : list)
        {
            if(num%2!=0)
            {
                odd1.add(num);
            }
        }
        System.out.println("Odd numbers are : " + odd1);

        // Second method using lambda function

        odd.removeIf(n -> n%2==0);
        System.out.println("using lambda function : " + odd);
    }
}
