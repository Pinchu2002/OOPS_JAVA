import java.io.File;
import java.io.*;
import java.util.*;

public class fileReader {
    public static void main(String[] args) {
        try{
            File f1 = new File("D:\\Java\\file-handling\\myfile1.txt");
            Scanner dataread = new Scanner(f1);
            while(dataread.hasNextLine()){
                String filedata = dataread.nextLine();
                System.out.println(filedata);
            }
            dataread.close();
            System.out.println("Great Success!");
        }catch(IOException e){
            System.out.println("Yaar Error aa gya!");
        }
    }
}
