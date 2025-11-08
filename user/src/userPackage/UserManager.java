package userPackage;
import java.util.Scanner;

public class UserManager {
    private String userName;
    private int UserAge;
    private String UserEmail;

    public void inputUserData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userName = input.nextLine();
        System.out.print("Enter your age: ");
        UserAge = input.nextInt();
        System.out.print("Enter your email: ");
        UserEmail = input.nextLine();
    }

    public void displayUserData(){
        System.out.println("\n=== USER INFORMATION ===");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + UserAge);
    }
}
