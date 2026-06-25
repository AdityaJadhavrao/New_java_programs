package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFIle_reader {
    
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt");

        int data;

        while((data=fr.read())!=-1)
        {
            System.out.print((char)data);
        }

        fr.close();
    }
}
