package String;

import java.util.Scanner;

public class checkIfStrnigContainsOnlyDigits {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        boolean palindrome = true;

        for(int i=0;i<str.length();i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                palindrome=false;
            }
        }
        if(palindrome)
        {
            System.out.println("String contains only digits");
        }
        else
        {
            System.out.println("String contains letters as well");
        }
    }
}
