package for_loop;
import java.util.Scanner;

public class vowelsInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.next();
        char c=' ';
        int vowels =0;
        int consonants=0;

        for(int i=0;i<=str.length()-1;i++)
        {
            c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("Number of vowels in the given String is : "+vowels);
        System.out.println("Number of consonants in the given String is : "+consonants);
    }
}

