import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
   public static void main(String[] args) {
       
    try {
        FileWriter myWriter = new FileWriter("testing.txt");
        myWriter.write("Files in java is kinda easy");
        myWriter.close();
         System.out.println("Successfully wrote to the file.");

    } catch (IOException e) {
         System.out.println("An error occurred.");
      e.printStackTrace();
    }
   } 
}
