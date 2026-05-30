import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.io.FileWriter;

//Library Management System..
class Student {
    private String name;
    private int roll;
    private String book;

    public Student(String name, int roll, String book) {
        this.name = name;
        this.roll = roll;
        this.book = book;
    }

    public int getRoll() {
        return roll;
    }

    public String getBook() {
        return book;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Book: " + book);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Paresh", 40, "Goat"));

        while (true) {
            System.out.println("----Librabry Management System----");
            System.out.println("\n 1. Add Book ");
            System.out.println("\n 2.Search Book ");
            System.out.println("\n 3.Issue Book ");
            System.out.println("\n 4.Return Book ");
            System.out.println("\n 5. Remove Book ");
            System.out.println("\n 6. Exit ");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // Add Details
            if (choice == 1) {
                System.out.println("Enter Book: ");
                String book = sc.nextLine();

                System.out.println("Enter the Student name: ");
                String name = sc.nextLine();

                System.out.println("Enter Roll number: ");
                int roll = sc.nextInt();

                Student s = new Student(name, roll, book);
                students.add(s);

            }

            // Search book
            else if (choice == 2) {
                System.out.println("Enter the Roll Number to search the book details: ");
                int searchRoll = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getRoll() == searchRoll) {
                        students.get(i).displayDetails();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not Found");
                }
            }

            // Issue book
            else if (choice == 3) {
                System.out.println("Enter the Roll Number to view issue details: ");
                int searchRoll = sc.nextInt();
                sc.nextLine();

                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getRoll() == searchRoll) {
                        System.out.println("Issued book details:");
                        students.get(i).displayDetails();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No issued book found for this roll number.");
                }
            }

            // Return Book
            else if (choice == 4) {
                System.out.println("Enter the Roll Number to return the book: ");
                int returnRoll = sc.nextInt();
                sc.nextLine();

                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getRoll() == returnRoll) {
                        found = true;
                        LocalDateTime returnTime = LocalDateTime.now();
                        System.out.println("Book returned successfully!");
                        System.out.println("Returned Book: " + students.get(i).getBook());
                        System.out.println("Return time: " + returnTime);
                        students.remove(i);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No matching issued book found for return.");
                }
            }

            // Remove the book
            else if (choice == 5) {
                System.out.println("Enter book name to remove: ");
                String removebook = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getBook().equalsIgnoreCase(removebook)) {
                        students.remove(i);
                        found = true;
                        System.out.println("Book removed successfully!");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found.");
                }
            }

            // Exit
            else if (choice == 6) {
                System.out.println("Exting the program...");
                break;
            }

            else {
                System.out.println("Invalid Book Name");
                break;

            }
        }
        FileWriter Fw = new FileWriter("Book.txt");
        Fw.write("Book Management System...");
        Fw.close();
        System.out.println("Data Written");
    }
}