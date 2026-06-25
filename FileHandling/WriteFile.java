package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt",true);

        String str = " Fileoutput stream";

        fos.write(str.getBytes());

        fos.close();
    }
}
