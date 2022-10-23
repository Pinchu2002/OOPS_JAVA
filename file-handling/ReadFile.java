import java.util.*;
import java.io.*;
public class ReadFile
{
  public static void main(String args[])throws FileNotFoundException
  {
    String fName = "D:\\Java\\file-handling\\myfile.txt";
    Scanner inFile = new Scanner(new File(fName));
    String name;
    int hourlyPay;
    int hoursWorked;
    while (inFile.hasNext())
    {
        name = inFile.next();
        hourlyPay = inFile.nextInt();
        System.out.println("HourlyPay: $" + hourlyPay);
        System.out.println("Hours worked by "+name+"?");
        hoursWorked = inFile.nextInt();
        System.out.println(hoursWorked);
        double pay = hourlyPay * hoursWorked;
        System.out.println("Pay is $" + pay);
    }
    inFile.close();
  }
}
