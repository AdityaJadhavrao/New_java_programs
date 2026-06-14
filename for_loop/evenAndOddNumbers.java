package for_loop;
import java.util.Scanner;

public class evenAndOddNumbers {
    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number : " + i);
            }
            else
            {
                System.out.println("Odd number : " + i);
            }
        }
    }
}
