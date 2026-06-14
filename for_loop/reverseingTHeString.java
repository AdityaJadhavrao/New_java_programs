package for_loop;
import java.util.Scanner;

public class reverseingTHeString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        String c="";

        for(int i=str.length()-1;i>=0;i--)
        {
            c=c+str.charAt(i);
        }
        System.out.print("Reverse String is : "+c);
    }
}
