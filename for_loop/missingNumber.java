package for_loop;

public class missingNumber {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,6};
        int n = arr.length+1; //6
        int sum = (n*(n+1))/2; //21

        for(int i=0;i<arr.length;i++)
        {
            sum = sum-arr[i];
        }

        System.out.println("Missing number is "+sum);
    }
}

