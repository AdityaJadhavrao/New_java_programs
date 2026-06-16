package for_loop;

public class missingNumber {
    

    public static void main(String args[])
    {
        int a[] = {1,2,3,4,6};

        int n = 6;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;

        for(int num : a)
        {
            actualSum+=num;
        }

        System.out.println("Missing number is :" + (expectedSum-actualSum));
    }
}
