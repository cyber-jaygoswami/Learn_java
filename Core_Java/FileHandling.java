import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class FileHandling{
    public static void main(String[] args){

        // File f1 = new File("Sample.txt");

        // System.out.println(f1.getName());
        // System.out.println(f1.getPath());
        // System.out.println(f1.isDirectory());
        // System.out.println(f1.isFile());
        // System.out.println(f1.length());
        // System.out.println(f1.canExecute());
        // System.out.println(f1.canRead());
        // System.out.println(f1.canWrite());
        // f1.setReadOnly();
        // System.out.println("\n\n" + f1.canRead());
        // System.out.println(f1.canWrite());


        // f1.delete();

    try{
        FileWriter f2 = new FileWriter("Sample.txt",true);

        f2.write("\njunk text");
        f2.close();

    }catch(Exception e){

    }


    }
}