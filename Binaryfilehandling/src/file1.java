import java.io.*;
public class file1 {
    public static void main(String[] args) throws IOException {
        String file = "output.bin";
        try{
            FileOutputStream fileos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fileos);
            os.writeInt(2048);
            os.writeDouble(2.414);
            os.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Writing binary file successfully! Now reading...");
        }
        try{
            FileInputStream fileis = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileis);
            int x = in.readInt();
            System.out.println(x);
            double d = in.readDouble();
            System.out.println(d);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Reading also done successfully! :))");
        }
    }
}
