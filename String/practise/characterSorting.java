package String.practise;

import java.util.Scanner;

public class characterSorting {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(Character.isAlphabetic(c))
            {
                System.out.println("Chatacters are : "+ c + " ");
            }
            
            else if (Character.isDigit(c))
            {
                System.out.println("Digites are : " + c + " ");
            } 
            else
            {
                System.out.println("symbols are : "+c + " ");
            }
        }
    }
}
