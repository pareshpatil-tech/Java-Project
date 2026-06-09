import java.util.Scanner;
import java.util.ArrayList;

class Railway {
    int id;
    String name;
    String name2;
    double price;

    public Railway(int id, String name, String name2, double price) {
        this.id = id;
        this.name = name;
        this.name2 = name2;
        this.price = price;
    }

    public String toString() {
        return "ID : " + id +
                "\nFrom : " + name +
                "\nTo : " + name2 +
                "\nPrice : " + price;
    }

}

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Railway> railways = new ArrayList<>();

        while (true) {
            System.out.println("====Railway Reservation System====\n");
            System.out.println("1. Book Ticket ");
            System.out.println("2. Cancel Ticket ");
            System.out.println("3. View Seats ");
            System.out.println("4. Wailting List ");
            System.out.println("5. Exit ");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("====Book Ticket====");

                System.out.println("Enter the Ticket ID: ");
                int id = sc.nextInt();

                System.out.println("Enter From Destination: ");
                String name = sc.nextLine();

                sc.nextLine();

                System.out.println("Enter To Destination: ");
                String name2 = sc.nextLine();

                System.out.println("Enter the Ticket Price: ");
                double price = sc.nextDouble();

                Railway r = new Railway(id, name, name2, price);
                railways.add(r);

                System.out.println("====Railway Data Saved Successfully====\n");

            }

            else if (choice == 2) {
                System.out.println("====Cancel Ticket====");

                System.out.println("Enter the id: ");
                int id = sc.nextInt();

                sc.nextLine();

                boolean found = false;
                for (int i = 0; i < railways.size(); i++) {
                    if (railways.get(i).id == id) {
                        railways.remove(i);
                        found = true;
                        System.out.println("Railway Data Remove Successfully...\n");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Details Not Found \n");
                }
            }

            else if (choice == 3) {
                System.out.println("====View Seats====");

                System.out.println("Enter the ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                boolean found = false;
                for (int i = 0; i < railways.size(); i++) {
                    if (railways.get(i).id == id) {
                        Railway r = railways.get(i);

                        System.out.println("Ticket ID: " + r.id);
                        System.out.println("From: " + r.name);
                        System.out.println("To: " + r.name2);
                        System.out.println("Price: " + r.price);

                        found = true;

                    }
                }
                if (!found) {
                    System.out.println("Details Not Found \n");
                }
            }

            else if (choice == 4) {
                System.out.println("====Waiting List====");

                boolean found = false;
                for (Railway r : railways) {
                    System.out.println(
                            r.id + " " +
                                    r.name + " -> " +
                                    r.name2 + " ₹" +
                                    r.price);
                }
                if (!found) {
                    System.out.println("Data Not Found \n");
                }
            }

            else if (choice == 5) {
                System.out.println("Exiting System...\n");
                break;
            }

            else {
                System.out.println("Invalid choice Please Try Again Later...\n");
            }
        }
    }
}
