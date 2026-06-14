package String;

import java.util.Scanner;

public class longestWordInString {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = scan.nextLine();
        String s[] = str.split(" ");
        String longest= "";

        for(int i=0;i<s.length;i++)
        {    
            for(int j=0;j<s.length;j++)
                {
                    if(s[i].length()>s[j].length() && s[i].length()>longest.length())
                    {
                        longest = s[i];
                    }
                }
        }
        System.out.println("Longest word in the String is : "+longest);
    }
}
