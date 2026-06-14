package String;

import java.util.Scanner;

public class replaceAllSpacesInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        str = str.replace(" ", "-");
        System.out.println(str);
    }
}
