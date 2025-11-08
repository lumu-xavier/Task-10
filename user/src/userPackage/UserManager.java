package userPackage;


public class UserManager {
    private String userName;
    private int UserAge;

    public UserManager(int userAge, String userName) {
        UserAge = userAge;
        this.userName = userName;
    }

    public void displayUserData(){
        System.out.println("\n=== USER INFORMATION ===");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + UserAge);
    }
}
