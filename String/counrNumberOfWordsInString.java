package String;

import java.util.Scanner;

public class counrNumberOfWordsInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        String s[] = str.split(" ");
        int count = 0;

        for(int i=0;i<s.length;i++)
        {
            String ss = s[i];
            if(s.length>=1)
            {
                count++;
            }
        }
        System.out.println("Number of Words in the given String is : "+count);

        //Second Method 

        System.out.println("Number of Words in the given String is : "+s.length);
    }
}
