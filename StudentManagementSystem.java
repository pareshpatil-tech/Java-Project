import java.util.Scanner;

public class StudentManagementSystem {

    // Student Management System

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store student data
        String[] names = new String[100];
        int[] rolls = new int[100];
        double[] marks = new double[100];

        int count = 0;

        while (true) {

            // Menu
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // ADD STUDENT
            if (choice == 1) {

                System.out.print("Enter student name: ");
                String studentName = sc.nextLine();

                System.out.print("Enter roll number: ");
                int studentRoll = sc.nextInt();

                System.out.print("Enter marks: ");
                double studentMarks = sc.nextDouble();

                // Store data in arrays
                names[count] = studentName;
                rolls[count] = studentRoll;
                marks[count] = studentMarks;

                count++;

                System.out.println("Student Added Successfully!");

            }

            // VIEW STUDENTS
            else if (choice == 2) {

                if (count == 0) {
                    System.out.println("No students found.");
                } else {

                    System.out.println("\n===== STUDENT LIST =====");

                    for (int i = 0; i < count; i++) {

                        System.out.println("Student " + (i + 1));

                        System.out.println("Name  : " + names[i]);
                        System.out.println("Roll  : " + rolls[i]);
                        System.out.println("Marks : " + marks[i]);

                        System.out.println("-----------------------");
                    }
                }

            }
            // DELETE STUDENT
            else if (choice == 3) {
                System.out.println("Enter roll number to delete:");
                int deleteRoll = sc.nextInt();
                boolean deleted = false;
                for (int i = 0; i < count; i++) {
                    if (rolls[i] == deleteRoll) {
                        for (int j = i; j < count - 1; j++) {
                            names[j] = names[j + 1];
                            rolls[j] = rolls[j + 1];
                            marks[j] = marks[j + 1];
                        }
                        count--;
                        deleted = true;
                        System.out.println("Student deleted successfully!");
                        break;
                    }
                }
                if (!deleted) {
                    System.out.println("Student not found.");
                }
            }

            // SEARCH STUDENT
            else if (choice == 4) {

                System.out.print("Enter roll number to search: ");
                int searchRoll = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (rolls[i] == searchRoll) {

                        System.out.println("\nStudent Found!");

                        System.out.println("Name  : " + names[i]);
                        System.out.println("Roll  : " + rolls[i]);
                        System.out.println("Marks : " + marks[i]);

                        found = true;

                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            }

            // EXIT
            else if (choice == 5) {

                System.out.println("Exiting Program...");
                break;

            }

            // INVALID CHOICE
            else {

                System.out.println("Invalid Choice.");

            }
        }

        sc.close();
    }
}