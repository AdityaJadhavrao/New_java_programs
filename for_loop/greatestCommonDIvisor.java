package for_loop;
import java.util.Scanner;

public class greatestCommonDIvisor {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        System.out.println("Please enter the number");
        int num2 = scan.nextInt();
        
        int gcd = 0;

        for(int i=1;i<=num && i<=num2; i++)
        {
            if(num%i ==0 && num2%i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("greatest common divisor is : " + gcd);
    }
}
