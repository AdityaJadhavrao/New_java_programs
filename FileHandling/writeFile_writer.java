package I.Input_Output_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile_writer {
    
    
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt",true);

        String str = " Writing file Using FileWriter";

        fw.write(str);

        fw.close();
    }
}

