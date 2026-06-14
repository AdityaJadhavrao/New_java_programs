package for_loop;
import java.util.Scanner;

public class printingPrimeNumbers {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        int count =0;

        for(int i=1;i<num;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    count=1;
                }
            }
            if(count==0)
            {
                System.out.println("Prime number : " + i);
            }
            else
            {
                System.out.println("Not a prime number : " + i);
                count=0;
            }}
        }
    }

