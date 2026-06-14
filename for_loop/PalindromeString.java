package for_loop;
public class PalindromeString {

    public static void main(String args[]) {
        String str = "madams";
        boolean palindrome = true;

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) 
            {
                palindrome = false;
                break;
            }
        }

        if (palindrome) 
        {
            System.out.println("Its a Palindrome String");
        } else 
        {
            System.out.println("Its not a Palindrome String");
        }
    }
}
