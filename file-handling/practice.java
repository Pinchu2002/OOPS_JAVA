import java.io.*;
public class practice {
    public static void main(String[] args) {
        File f1 = new File("D:\\Java\\file-handling\\output.txt");
        if(f1.exists()){
            System.out.println("The name of the file: " + f1.getName());
            System.out.println("The absolute path of the file: " + f1.getAbsolutePath());
            System.out.println("Is file Writeable?: " + f1.canWrite());
            System.out.println("Is file Readable?: " + f1.canRead());
            System.out.println("Size of file in lenght: " + f1.length());
        }
        else{
            System.out.println("File does not exist!");
        }
    }    
}
