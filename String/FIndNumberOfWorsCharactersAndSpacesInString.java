package String;

import java.util.Scanner;
class FindNumberOfWorsCharactersAndSpacesInString {
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter the String");
       String str = scan.nextLine();
       
       int character=0;
       int spaces=0;
       int word=0;
       
       for(int i=0;i<str.length();i++)
       {
           char c = str.charAt(i);
           character++;
           
           if(c==' ')
           {
               spaces ++;
           }
       }
           if(str.trim().length()==0)
           {
                word=0;
           }
           else
           {
                word = spaces+1;
           }
           
        System.out.println("Characters: " + character);
        System.out.println("Words: " + word);
        System.out.println("Spaces: " + spaces);
    }
}