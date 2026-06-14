package String;

import java.util.Scanner;

public class mostFrequentCharacterInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();

        char c = ' ';
        char mostfreq = ' ';
        int maxcount = 0;

        for(int i=0;i<str.length();i++)
        {
            c = str.charAt(i);
            int count = 0;

            for(int j=0;j<str.length();j++)
            {
                if(c==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>maxcount)
            {
                maxcount=count;
                mostfreq = c;
            }
        }
        System.out.println("most freqwunetly used charcter in the given String is : "+mostfreq);
        System.out.println("Frequency : "+maxcount);
    }
}
