package String;

public class findAllSubsutringsOfGivenString {
    
    public static void main(String[] args) {
        
        String str = "ABC";
        int length = str.length();

        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<=length;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
