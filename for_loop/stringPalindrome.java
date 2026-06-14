package for_loop;
import java.util.Scanner;

public class stringPalindrome {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter the String");
        String str = scan.next();
        boolean palindrome=true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                palindrome=false;
            }
        }
        if(palindrome)
        {
            System.out.println("Plaindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}

