package for_loop;
import java.util.Scanner;

public class sumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        int temp = num;
        int sum=0;

        while(temp!=0)
        {
            int digit = temp%10;
            sum = sum+digit;
            temp = temp/10;
        }
        System.out.println("Sum of digits is : " + sum);
    }
}
