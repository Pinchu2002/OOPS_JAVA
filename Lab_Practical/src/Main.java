import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // User-Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Enrollment No.: ");
        int n = sc.nextInt();
        System.out.println("Enter Branch: ");
        String b = sc.next();
        System.out.println("Enter Semester : ");
        int sem = sc.nextInt();
        System.out.println("Enter College: ");
        String coll = sc.next();
        sc.close();

        // File Handling
        // Writing data into the file
        try {
            String file = "StudentData.txt";
            FileWriter fwrite = new FileWriter(new File(file));
            fwrite.write("Name: " + name + "\n");
            fwrite.write("Enrollment No: " + n + "\n");
            fwrite.write("Branch: "  + b + "\n");
            fwrite.write("Semester: " + sem + "\n");
            fwrite.write("College: " + coll + "\n");
            System.out.println("Content is successfully written!");
            fwrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading data from the file
        try{
            File f1 = new File("StudentData.txt");
            Scanner dataread = new Scanner(f1);
            while(dataread.hasNextLine()){
                String uname = dataread.nextLine();
                System.out.println(uname + "\n");
                String enrollment = dataread.nextLine();
                System.out.println(enrollment + "\n");
                String bname = dataread.nextLine();
                System.out.println(bname+"\n");
                String semes = dataread.nextLine();
                System.out.println(semes+"\n");
                String cname = dataread.nextLine();
                System.out.println(cname+"\n");
                System.out.println("Data Read Successfully!");
//                dataread.close();

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        // merging of data of two files!
        try{
            PrintWriter pw = new PrintWriter("StudentRecord.txt");
            BufferedReader br1 = new BufferedReader(new FileReader("StudentDataFile1.txt"));
            String line1 = br1.readLine();
            while(line1 != null){
                pw.println(line1);
                line1 = br1.readLine();
            }
            BufferedReader br2 = new BufferedReader(new FileReader("StudentDataFile2.txt"));
            String line2 = br2.readLine();
            while(line2 != null){
                pw.println(line2);
                line2 = br2.readLine();
            }
            pw.flush();
            br1.close();
            br2.close();
            pw.close();
            System.out.println("Data Merged into StudentRecorded Successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}