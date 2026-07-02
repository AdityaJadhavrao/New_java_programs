package String;

public class snowball_string {


    public static void main(String args[])
    {

        System.out.println(isSnowball("I am bad"));
        System.out.println(isSnowball("i am good"));
        System.out.println(isSnowball("i am bad good great"));

    }

    public static boolean isSnowball(String sentence)
    {
        String words[] = sentence.split(" ");
        
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length() != i+1)
            {
                return false;
            }
        }
        return true;
    }

    
}
