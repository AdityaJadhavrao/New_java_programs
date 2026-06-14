package String;

import java.util.Scanner;

public class countUppercaseAndLowercase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        char c = ' ';
        int upper = 0;
        int lower = 0;

        for(int i=0;i<str.length();i++)
        {
            c = str.charAt(i);
            if(c>='A' && c<='Z')
            {
                upper++;
            }
            else if (c>='a' && c<='z')
            {
                lower++;
            }
        }
        System.out.println("Uppercase count is : "+upper);
        System.out.println("Lowercase count is : "+lower);
    }
}
