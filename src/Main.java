import itemPackage.ItemManager;
import userPackage.UserManager;
public class Main {
    public static void main(String[] args) {

        System.out.println(" SIMPLE DATA MANAGEMENT APPLICATION \n");
        UserManager userManager = new UserManager();
        ItemManager itemManager = new ItemManager();

        userManager.inputUserData();
        itemManager.inputItemData();

        userManager.displayUserData();
        itemManager.displayItemData();
    }
}