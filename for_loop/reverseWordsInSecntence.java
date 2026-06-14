package for_loop;
import java.util.Scanner;

public class reverseWordsInSecntence {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        String rev[] = str.split(" ");
        for(int i=rev.length-1;i>=0;i--)
        {
             System.out.print(rev[i]+" ");
        }
        
    }
}
