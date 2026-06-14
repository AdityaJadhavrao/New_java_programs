package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class demo {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        int num = scan.nextInt();

        for(int i=1;i<num;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number is : "+i);
            }
            else
            {
                System.out.println("Odd number is : "+i);
            }
            
        }

    }

}
