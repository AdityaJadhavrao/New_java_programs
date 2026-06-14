package for_loop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        int count=0;
        int b=0;
        for(int i=2;i<=num;i++)
        {
            for(int j=2;j<i-1;j++)
            {
                if(i%j==0)
                {
                   count=1;
                   break;
                }
            }
            if(count==0)
            {
                b+=i;
            }
            else
            {
                count=0;
            }
            
        }
        System.out.println("Addition of prime numbers is : "+b);
        
    }
}
