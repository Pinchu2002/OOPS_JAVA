import java.util.*;
import java.io.*;

public class file1 {
    public static void main(String[] args) throws FileNotFoundException {
        String f_name = "D:\\Java\\File_Handling\\src\\myfile.txt";
        Scanner infile = new Scanner(new File(f_name));
        String name;
        int hourlyPay;
        int hoursWorked;
        while(infile.hasNext()){
            name = infile.next();
            hourlyPay = infile.nextInt();
            System.out.println("Hours worked by " + name + "?");
            hoursWorked = infile.nextInt();
            double pay = hourlyPay * hoursWorked;
            System.out.println("Pay is " + pay);
        }
        infile.close();
    }
}
