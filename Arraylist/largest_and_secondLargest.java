package Arraylist;

public class largest_and_secondLargest {
 
   public static void main(String args[])
   {
     
    int arr[] = {4,3,6,3,43,6,7,8,32,3,2,123,23,23,232323};

    Integer largest = Integer.MIN_VALUE;
    Integer secondLargest = Integer.MIN_VALUE;

    for(Integer num : arr)
    {
        if(largest < num)
        {
            secondLargest = largest;
            largest = num;
        }
        if(num > secondLargest && num!=largest)
        {
            secondLargest = num;
        }
    }
    System.out.println("Largest : "+ largest);
    System.out.println("Second largest : "+ secondLargest);
   }
}
