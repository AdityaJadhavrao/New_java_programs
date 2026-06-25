package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile_bufferedWriter {
    
    public static void main(String args[]) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt", true));

        bw.write(" Writing file using BufferedWriter");
        bw.newLine();
        bw.write(" Java learning");
        bw.close();
    }
}

