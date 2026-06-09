import java.util.Scanner;
import java.util.ArrayList;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Product> Inventory = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----Inventory Management System----");
            System.out.println("\n 1. Add Product ");
            System.out.println("\n 2. View Product");
            System.out.println("\n 3. Search Product");
            System.out.println("\n 4.Remove Product");
            System.out.println("\n 5. Add Stock");
            System.out.println("\n 6. Sell Product");
            System.out.println("\n 7. Total Inventory  Product");
            System.out.println("\n 8. Exit");

            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();

            sc.nextLine();

            // Add Product
            if (choice == 1) {
                System.out.println("----Add Product----");
                System.out.println("Enter the Product id: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter the Product name: ");
                String name = sc.nextLine();

                System.out.println("Enter the Product quantity: ");
                int quantity = sc.nextInt();

                System.out.println("Enter the Product Price: ");
                double price = sc.nextDouble();

                Product p1 = new Product(id, name, quantity, price);

                Inventory.add(p1);

                System.out.println("Product Added Successfully");
            }

            // View Product
            else if (choice == 2) {
                System.out.println("----View Product----");
                System.out.println("Enter the Product ID to View Product: ");
                int id = sc.nextInt();

                boolean found = false;
                if (choice == 0) {
                    System.out.println("No Inventory Data Found");
                } else {
                    System.out.println("=====Student List=====");

                    for (Product p : Inventory) {
                        p.displayDetails();
                    }
                }
            }

            // Search Product
            else if (choice == 3) {
                System.out.println("----Search Product----");
                System.out.println("Enter the Product ID to search product: ");
                int searchid = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < Inventory.size(); i++) {
                    if (Inventory.get(i).id == searchid) {
                        Inventory.get(i).displayDetails();
                        found = true;
                        break;
                    }
                    if (!found) {
                        System.out.println("No Products Data");
                    }
                }
            }

            // Remove Product
            else if (choice == 4) {
                System.out.println("=====Remove Product=====");
                System.out.println("Enter the Product ID to remove the product: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < Inventory.size(); i++) {
                    if (Inventory.get(i).id == id) {
                        Inventory.remove(i);
                        Inventory.get(i).displayDetails();
                        found = true;
                        break;
                    }
                    if (!found) {
                        System.out.println("No Product Found");
                    }
                }
            }

            // Add Stock
            else if (choice == 5) {
                System.out.println("=====Add Stock=====");
                System.out.println("Enter the Product ID to add stock: ");
                int id = sc.nextInt();

                System.out.println("Enter quantity to add: ");
                int addStock = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < Inventory.size(); i++) {
                    if (Inventory.get(i).id == id) {
                        Inventory.get(i).quantity += addStock;
                        System.out.println("Stock Added Successfuly");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product Not Found");
                }

            }

            // Sell Product
            else if (choice == 6) {
                System.out.println("=====Sell Product=====");
                System.out.println("Enter the Product ID to Sell Stock: ");
                int id = sc.nextInt();

                for (int i = 0; i < Inventory.size(); i++) {
                    System.out.println("Enter quantity to sell: ");
                    int sold = sc.nextInt();
                    if (Inventory.get(i).quantity >= sold) {
                        Inventory.get(i).quantity -= sold;
                    }

                }
            }

            // Total inventory value
            else if (choice == 7) {
                System.out.println("=====Total Inventory Value=====");
                System.out.println("Enter the Product ID to Sell Stock: ");
                int id = sc.nextInt();

                boolean found = false;

                double total = 0;

                for (Product p : Inventory) {
                    total += p.quantity * p.price;
                }
                System.out.println("Total Inventory Value: " + total);
            }

            // Exit
            else if (choice == 8) {
                System.out.println("Exiting program....");
                break;
            } else {
                System.out.println("Invalid Imput..");
            }
        }
    }
}