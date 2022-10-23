import java.io.*;

public class ReadBinaryFile
{
  public static void main (String [] args) throws IOException
  {
    File inFile = new File ("output.bin");
    FileInputStream inStream = new FileInputStream (inFile);
    DataInputStream input = new DataInputStream (inStream);

    String name;
    long ssNum;
    double gpa;

    try
    {
      while (true)
      {
        name = input.readUTF();
        ssNum = input.readLong();
        gpa = input.readDouble();

        System.out.println (name + "  " + ssNum + "  " + gpa);
      }
    }
    catch (EOFException e)
    {
      // Do nothing if it is the end of file.
    }
    catch (IOException e)
    {
      System.out.println (e.getMessage());
      System.exit(0);
    }
    finally
    {
      inStream.close();
    }

  }
}