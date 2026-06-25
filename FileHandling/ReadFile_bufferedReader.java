package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_bufferedReader {
    
    public static void main(String[] args) {

        if(args.length == 0)
        {
            System.out.println("Please provide a string");
            return;
        }

        reverse(args[0]);
    }

    public static void reverse(String word)
    {
        boolean palindrome = true;

        for(int i = 0; i < word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-1-i))
            {
                palindrome = false;
                break;
            }
        }

        if(palindrome)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}
