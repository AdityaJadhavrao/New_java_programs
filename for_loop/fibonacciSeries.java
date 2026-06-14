package for_loop;


import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();

        int first = 0;
        int second = 1;

        for(int i=0;i<=num;i++)
        {
            System.out.print(first + " ");
            int temp = first+second;
            first = second;
            second = temp;


        }
    }
    
}
