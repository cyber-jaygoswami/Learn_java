import java.io.FileReader;
import java.io.BufferedReader;

public class FileReading{
    public static void main(String[] args){

        try{
            FileReader f1 = new FileReader("Sample.txt");

            BufferedReader b1 = new BufferedReader(f1);

            // System.out.println(b1.read());
            // System.out.println(b1.read());


            System.out.println(b1.readLine());

            String currentLine;
            while((currentLine= b1.readLine()) != null){
                System.out.println(currentLine);
            }


            f1.close();
        }
        catch(Exception e){

        }
        

    }
}