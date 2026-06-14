package for_loop;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            if(num>largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if ( num > secondLargest && num != largest)
            {
                secondLargest = num;
            }
        }


        System.out.println("Second largest number is: " + secondLargest);
    }
}
