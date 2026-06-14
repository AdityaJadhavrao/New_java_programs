package for_loop;
public class largestOfTwoNumbers {
    
    public static void main(String[] args) {
        
        int a =30;
        int b=20;
        int c=40;

        if(a>b && a>c)
        {
            System.out.println("largest is : " + a);
        }
        else if (b>a && b>c) 
        {
            System.out.println("largest number is : " + b);
        }
        else if(c>a && c>b)
        {
            System.out.println("largest number is : " + c);
        }
        else
        {
            System.out.println("All are equal numbers");
        }
    }
}
