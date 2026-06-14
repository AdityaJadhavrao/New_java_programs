package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class replaceElementsWithIndex {
    
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>(List.of("apple","watermelon","orange"));

        fruits.set(1, "mango");

        System.out.println(fruits);
    }
}
