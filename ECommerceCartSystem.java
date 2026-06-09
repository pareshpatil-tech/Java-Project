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
}

public class ECommerceCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("====E-Commerce Cart System====\n");
            System.out.println("1. Add Product ");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Total Price");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("====Add Product====");
                System.out.println("Enter the Product ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter the Product Name: ");
                String name = sc.nextLine();

                System.out.println("Enter the Product Quantity: ");
                int quantity = sc.nextInt();

                System.out.println("Enter the Product Price: ");
                double price = sc.nextDouble();

                Product p = new Product(id, name, quantity, price);
                products.add(p);
                System.out.println("Product Added Successfully...");
            }

            else if (choice == 2) {
                System.out.println("====Remove Product====");
                System.out.println("Enter the Product ID: ");
                int id = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == id) {
                        products.remove(i);
                        found = true;
                        System.out.println("Product Remove Successfully...");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product Not Found");
                }
            }

            else if (choice == 3) {
                System.out.println("====View Cart====");

                System.out.println("Enter the Product ID: ");
                int id = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == id) {
                        Product p = products.get(i);

                        System.out.println("Product ID: " + p.id);
                        System.out.println("Product Name: " + p.name);
                        System.out.println("Product Quantity: " + p.quantity);
                        System.out.println("Product Price: " + p.price);

                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Product Data Not Found");
                }
            }

            else if (choice == 4) {
                System.out.println("====Total Price====");

                double total = 0;

                for (Product p : products) {
                    total += p.quantity * p.price;
                }
                System.out.println("Total: " + total);
            }

            else if (choice == 5) {
                System.out.println("====checkout====");
                System.out.println("Enter the Product ID: ");
                int id = sc.nextInt();

                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == id) {
                        Product p = products.get(i);
                        System.out.println("Product Quantity: " + p.quantity);

                    }
                }
            }

            else if (choice == 6) {
                System.out.println("Exiting the System...");
                break;
            }

            else {
                System.out.println("Invalid Choice, Please Try Again...");
            }
        }
    }
}