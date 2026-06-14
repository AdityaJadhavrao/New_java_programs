package String;

import java.util.Arrays;

public class anagramString {
    
    public static void main(String[] args) {
        
        String s = "silent";
        String a = "listens";


        char b[] = s.toCharArray();
        char c[] = a.toCharArray();

        Arrays.sort(c);
        Arrays.sort(b);

        System.out.println(Arrays.equals(b, c));
    }

    //function for reverse string       


}
