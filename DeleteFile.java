import java.io.File;



public class DeleteFile {
    public static void main(){

        File myObj = new File("testing.txt");
        if(myObj.delete()){
                  System.out.println("Deleted the file: " + myObj.getName());

        }else{
                  System.out.println("Failed to delete the file.");

        }

    }
}
