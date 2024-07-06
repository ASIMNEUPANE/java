import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class NewCopy {
    public static void main(String[] args) {
         try {

            //file created for destination file
            File readFile = new File("./testing.txt");
            File destinationFIle = new File("./newmew.txt");
            if(destinationFIle.createNewFile()){
                System.out.println("Created destination file to copy");
            }
            else{
                 System.out.println("File with this name is already created");

            }
           FileWriter myWriter = new FileWriter("./newmew.txt");


            Scanner myReader = new Scanner(readFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                myWriter.write(data);

            }
              myWriter.close();
              System.out.println("copy successfully");
            
            
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    }
}
