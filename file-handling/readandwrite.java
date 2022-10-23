import java.util.*;
import java.io.*;
public class readandwrite {
    public static void main(String[] args)throws IOException {
        String fpath = "D:\\Java\\file-handling\\output.txt";
        Scanner dataread = new Scanner(new File(fpath));
        String f_out_path = "D:\\Java\\file-handling\\data.txt";
        FileWriter fwrite = new FileWriter(new File(f_out_path));
        String name = null;
        int age = 0;
        try{
            while(dataread.hasNext()){
                name = dataread.next();
                fwrite.write(name);
                age = dataread.nextInt();
                fwrite.write(age);
            }
            System.out.println("Naam: " + name +"umar: " + age);
            dataread.close();
            // fwrite.write("UserName: ");
            // fwrite.write("UserAge: ");
            fwrite.close();
        }catch(Exception e){
            System.out.println("Yarr Error aa gya!");
        }
    }
}
