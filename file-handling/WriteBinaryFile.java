import java.io.*;

public class WriteBinaryFile
{
  public static void main (String [] args) throws IOException
  {
    File outFile = new File ("output.bin");
    FileOutputStream outStream = new FileOutputStream (outFile);
    DataOutputStream output = new DataOutputStream (outStream);

    String name = "Rahul Mishra";
    long ssNum = 123456789;
    double gpa = 9.5;

    try
    {
      output.writeUTF (name);
      output.writeLong (ssNum);
      output.writeDouble (gpa);
    }
    catch (IOException e)
    {
      System.out.println (e.getMessage());
      System.exit(0);
    }
    finally
    {
      outStream.close();
    }

  }
}