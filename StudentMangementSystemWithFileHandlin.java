import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
//Student Management System with file Handling & also with class,object,parameterised costructor....

class Student {
    String name;
    int roll;
    double marks;

    public Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + roll);
        System.out.println("Marks Obtained: " + marks);
    }

    void isDistinction() {
        if (marks >= 75) {
            System.out.println("Passed with Distinction!!");
        } else {
            System.out.println("Average marks");
        }
    }

    void isPass() {
        if (marks >= 35) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
}

public class StudentMangementSystemWithFileHandlin {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Paresh Patil", 40, 90);
        s1.displayDetails();
        s1.isDistinction();
        s1.isPass();

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Shlok patil", 41, 89.67));
        students.add(new Student("Deep Patil", 42, 88.78));

        while (true) {
            System.out.println("---Student Management System With File Handling---");
            System.out.println("\n 1.Add Student");
            System.out.println("\n 2.Topper Student");
            System.out.println("\n 3.Search Student");
            System.out.println("\n 4.RemoveStudent");
            System.out.println("\n 5.Exit");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // Add Details
            if (choice == 1) {
                System.out.println("Enter Name: ");
                String name = sc.nextLine();

                System.out.println("Enter the Roll Number: ");
                int roll = sc.nextInt();

                System.out.println("Enter Marks: ");
                double marks = sc.nextDouble();

                sc.nextLine();

                Student s = new Student(name, roll, marks);
                students.add(s);

                System.out.println("Student Added successfully");
            }

            // topper Details
            else if (choice == 2) {
                if (choice == 0) {
                    System.out.println("No Student Data Found ");
                } else {
                    System.out.println("\n-----Topper Details-----\n");
                    Student topper = students.get(0);
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).marks > topper.marks) {
                            topper = students.get(i);
                        }
                    }
                    System.out.println("Topper Details: ");
                    topper.displayDetails();
                }
            }

            // search menu
            else if (choice == 3) {
                System.out.println("-----Search the Roll Number-----");
                boolean found = false;
                System.out.println("Enter the Roll Number you want to search: ");
                int searchRoll = sc.nextInt();

                System.out.println("-----Searching the Student Details-----");

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).roll == searchRoll) {
                        students.get(i).displayDetails();
                        found = true;
                        break;
                    }
                }
            }

            // Remove Details
            else if (choice == 4) {
                System.out.println("Enter the Roll Number: ");
                int removeRoll = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).roll == removeRoll) {
                        students.remove(i);
                        found = true;
                        System.out.println("Student Remove Successfuly");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student Not Found");
                }
            }

            // Exit
            else if (choice == 5) {
                System.out.println("Exiting the Program....");
                break;

            }

            else {
                System.out.println("Invalid Choice");

            }
        }

        FileWriter fw = new FileWriter("Students.txt");
        fw.write("Student Managemant System Using File Handling");
        fw.close();
        System.out.println("Data Written");
    }
}