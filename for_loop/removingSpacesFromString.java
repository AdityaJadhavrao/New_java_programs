package for_loop;
import java.util.Scanner;

public class removingSpacesFromString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();

        str = str.replaceAll(" ", "");
        System.out.println("After removing spaces : "+str);
    }
}
