package Arraylist;

public class duplicateElementsInArray {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,2,3,4,5,6};

        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
