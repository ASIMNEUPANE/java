import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileExample {
    public static void main(String[] args) {
        // Define the source and destination file paths
        Path sourcePath = Paths.get("./testing.txt");
        Path destinationPath = Paths.get("./new.txt");

        try {
            // Copy the file from source to destination
            Files.copy(sourcePath, destinationPath);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to copy the file.");
        }
    }
}
