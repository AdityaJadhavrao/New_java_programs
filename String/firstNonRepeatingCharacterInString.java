package String;

import java.util.Scanner;

public class firstNonRepeatingCharacterInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            int count = 0;

            for(int j=0;j<str.length();j++)
            {
                if(c==str.charAt(j))
                {
                    count++;
                }
            }

            if(count ==1)
            {
                System.out.println("First non repating charcter in the given String is : "+c);
                break;
            }
        }
        
    }
}
