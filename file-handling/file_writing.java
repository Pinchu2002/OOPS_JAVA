import java.io.*;
public class file_writing {
    public static void main(String[] args){
        // Create myfile and write content to it!
        String s = "Frnds";
        try{
            File name = new File("D:\\Java\\file-handling\\myfile2.txt");
            FileWriter fwrite = new FileWriter(name);
            fwrite.write("Hello frnds Chai pi loh!");
            fwrite.write("\n");
            fwrite.write(s);
            fwrite.close();     
            System.out.println("Content is successfully written!");
        }catch(IOException e){
            System.out.println("Yaar Error aa gya!");
        }
       
    }
}
