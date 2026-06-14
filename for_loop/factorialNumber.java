package for_loop;


import java.util.Scanner;

public class factorialNumber {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of given number is : "+fact);
    }
    
}
