package I.Input_Output_Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_bufferedReader {
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt"));

        String str;

        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }

        br.close();
    }
}
