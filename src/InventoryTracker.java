import java.util.ArrayList;
import java.util.Scanner;

public class InventoryTracker {

    public static void main(String[] args) {
        ArrayList<InventoryTrackerItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int i = 1;
            for (InventoryTrackerItem item : items) {

                System.out.println(+i + ". " + "[" + item.quantity + "]" +  " " + item.text);
                i++;
            }

            System.out.println(                          );
            System.out.println("1. Create inventory item");
            System.out.println("2. Remove inventory item");
            System.out.println("3. Update the quantity of inventory item");

            String option = scanner.nextLine();

            InventoryTrackerItem item = null;
            if (option.equals("1")) {
                System.out.println("Enter your inventory item:");
                String text = scanner.nextLine();
                item = new InventoryTrackerItem(text,0);
                items.add(item);

            } else if (option.equals("2")) {
                System.out.println("Enter the item number you would like to remove");
                int itemNumber = Integer.valueOf(scanner.nextLine());
                items.remove(itemNumber - 1);

            } else if (option.equals("3")) {
                System.out.println("Enter the item number you would like to update");
                int itemNumber = Integer.valueOf(scanner.nextLine());
                item = items.get(itemNumber - 1);

                System.out.println("Enter the updated quantity");
                int newQuantity = Integer.valueOf(scanner.nextLine());
                item.quantity = newQuantity;

            }

                else {
                System.out.println("Invalid option");

                }
//                   String checkbox = "[ ] ";
//                    if (item.quantity) {
//                        checkbox = "[x] ";
//                    }

        }
    }
}
