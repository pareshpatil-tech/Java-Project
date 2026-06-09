import java.util.HashMap;
import java.util.Scanner;

class names {
    long num;
    String name;

    public names(long num, String name) {
        this.num = num;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Enter the Number: " + num);
        System.out.println("Enter the Name: " + name);
    }

}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, String> names = new HashMap<>();

        while (true) {
            System.out.println("====PhoneBook====\n");
            System.out.println("1. Add Contact ");
            System.out.println("2. Search Contact ");
            System.out.println("3. Delete Contact ");
            System.out.println("4. Show All Contact ");
            System.out.println("5. Exit ");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("====Add COntact====");

                sc.nextLine();

                System.out.println("Enter the Contact Name: ");
                String name = sc.nextLine();

                System.out.println("Enter the Contact Number: ");
                long num = sc.nextLong();

                names.put(num, name);
                System.out.println(names);
            }

            else if (choice == 2) {
                System.out.println("====Search Contact====");

                System.out.println("Enter Number:");
                long num = sc.nextLong();

                if (names.containsKey(num)) {
                    System.out.println("Name: " + names.get(num));
                } else {
                    System.out.println("Contact Not Found");
                }
            }

            else if (choice == 3) {
                System.out.println("====Delete Contact====");

                System.out.println("Enter Number:");
                long num = sc.nextLong();

                if (names.containsKey(num)) {
                    names.remove(num);
                    System.out.println("Contact Removed");
                } else {
                    System.out.println("Contact Not Found");
                }
            }

            else if (choice == 4) {
                System.out.println("====Show All Contact====");

                for (Long num : names.keySet()) {
                    System.out.println(num + " : " + names.get(num));
                }

            }

            else if (choice == 5) {
                System.out.println("Exiting the Program....");
                break;
            }

            else {
                System.out.println("Invalid Choice Try again later..");
            }

        }

    }
}
