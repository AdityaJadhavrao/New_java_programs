package for_loop;
import java.util.Scanner;

public class duplicateCharacterInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        char c = ' ';

        for(int i=0;i<=str.length()-1;i++)
        {
            c = str.charAt(i);
            int count = 0;
            for(int j=0;j<=str.length()-1;j++)
            {
                if(c==str.charAt(j))
                {
                    count++;
                }
            }

            // OCCURANCE OF EACH CHARACTER IN A STRING

            if(count>=1 && str.indexOf(c)==i) 
            {
                System.out.println(c+"="+count);
            }

            // FINDING DUPLICATE CHARACTER IN A STRING
                
            // if(count>1 && str.indexOf(c)==i) 
            // {
            //     System.out.println("Duplicate character in the String is : "+c + " = "+count);
            // }
        }
    }
}
