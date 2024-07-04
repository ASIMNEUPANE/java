import java.util.Scanner;

public class UserPackage {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String useName = myObj.nextLine();
        System.out.println("Username is : " + useName);

    }
}
