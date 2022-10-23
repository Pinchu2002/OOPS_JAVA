import java.io.*;
public class File1
{
  public static void main (String [] args) throws IOException 
  {
    File outFile = new File ("output.txt");
    FileWriter fWriter = new FileWriter (outFile);
    String name="Rahul";
    double hours=23;
      try (PrintWriter pWriter = new PrintWriter (fWriter)) {
          pWriter.println (name);
          pWriter.println (hours);
      }
  }
}