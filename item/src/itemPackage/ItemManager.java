package itemPackage;

import java.util.Scanner;

public class ItemManager {
    private String itemName;
    private double itemPrice;

    public void inputItemData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the item you want to add: ");
        itemName = input.nextLine();
        System.out.print("Enter the price of the item you want to add: ");
        itemPrice = input.nextDouble();
    }

    public void displayItemData() {
        System.out.println("\n=== ITEM INFO ===");
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + itemPrice);
    }
}
