package I.Input_Output_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    

    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("/home/prithvirajjadhavrao/Documents/Programs/I/Input_Output_Streams/file.txt");
        int data;

        while(((data=fis.read())!=-1))
        {
            System.out.print((char)data);
        }

        fis.close();
    }
}
