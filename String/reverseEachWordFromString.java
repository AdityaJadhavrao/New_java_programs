package String;

import java.util.Scanner;

public class reverseEachWordFromString {
 
    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the String");
    String str = scan.nextLine();
    String s[] = str.split(" ");

    for(String word : s)
    {

        String rev = "";

        for(int i=word.length()-1;i>=0;i--)
        {
            rev = rev+word.charAt(i);
        }

        System.out.print(rev+" ");
    }
}
    
}
