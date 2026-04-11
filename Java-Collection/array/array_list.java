import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n ArrayList CRUD Operation Example");

            System.out.println("1. Create (Add item)");
            System.out.println("2. Read (Display all items)");
            System.out.println("3. Update (Modify item)");
            System.out.println("4. Delete (Remove item)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // CREATE - Add item
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    items.add(newItem);
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    // READ - Display all items
                    System.out.println("\n=== Current Items ===");
                    if (items.isEmpty()) {
                        System.out.println("No items in the list.");
                    } else {
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + ". " + items.get(i));
                        }
                    }
                    break;

                case 3:
                    // UPDATE - Modify item
                    if (items.isEmpty()) {
                        System.out.println("No items to update.");
                        break;
                    }
                    System.out.println("Current items:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                    System.out.print("Enter item number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // consume newline

                    if (updateIndex >= 0 && updateIndex < items.size()) {
                        System.out.print("Enter new value: ");
                        String updatedItem = scanner.nextLine();
                        items.set(updateIndex, updatedItem);
                        System.out.println("Item updated successfully!");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;

                case 4:
                    // DELETE - Remove item
                    if (items.isEmpty()) {
                        System.out.println("No items to delete.");
                        break;
                    }
                    System.out.println("Current items:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                    System.out.print("Enter item number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // consume newline

                    if (deleteIndex >= 0 && deleteIndex < items.size()) {
                        String removedItem = items.remove(deleteIndex);
                        System.out.println("Removed: " + removedItem);
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 5);

        scanner.close();
    }
}
