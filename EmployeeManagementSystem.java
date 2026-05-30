import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Employee {
    // Employee Management System.....
    String name;
    int EmployeeID;
    double salary;

    public Employee(String name, int EmployeeID, double salary) {
        this.name = name;
        this.EmployeeID = EmployeeID;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println(" Name: " + name);
        System.out.println("Employee ID number: " + EmployeeID);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public double getSalary() {
        return salary;
    }

    public static void saveEmployees(ArrayList<Employee> employees) {
        try {
            FileWriter writer = new FileWriter("employees.txt");

            for (Employee e : employees) {
                writer.write(
                        e.getName() + "," +
                                e.getEmployeeID() + "," +
                                e.getSalary() + "\n");
            }
            writer.close();
            System.out.println("Data saved successfully");
        } catch (IOException e) {
            System.out.println("Error saving files");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        employee.add(new Employee("Paresh Patil", 40, 98000));

        while (true) {
            System.out.println("-----Employee Management System-----");
            System.out.println("\n 1.Add Employee");
            System.out.println("\n 2.Search Employee");
            System.out.println("\n 3.Remove Employee");
            System.out.println("\n 4.Highest Salary Employee");
            System.out.println("\n 5. Save The File");
            System.out.println("\n 6. Exit ");

            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            // Add Employee....

            if (choice == 1) {
                System.out.println("---Add Employee---");
                System.out.println("Enter the Empoyee name for Add: ");
                String name = sc.nextLine();

                System.out.println("Enter the Employee ID: ");
                int EmployeeID = sc.nextInt();

                System.out.println("Enter the Salary of Employee: ");
                double salary = sc.nextDouble();

                sc.nextLine();

                Employee E1 = new Employee(name, EmployeeID, salary);
                employee.add(E1);
                System.out.println("Employee Added Succesfully..");

            }

            // Search Employee
            else if (choice == 2) {
                System.out.println("----Search Employee----");
                System.out.println("Enter the  EmployeeID to search: ");
                int searchEmployeeID = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < employee.size(); i++) {
                    if (employee.get(i).getEmployeeID() == searchEmployeeID) {
                        employee.get(i).displayDetails();
                        found = true;
                        break;
                    }
                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                }
            }

            // Remove Employee
            else if (choice == 3) {
                System.out.println("----Remove Employee----");
                System.out.println("Enter the Employee ID for remove the employee: ");
                int removeID = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < employee.size(); i++) {
                    if (employee.get(i).getEmployeeID() == removeID) {
                        employee.remove(i);
                        System.out.println("Employee Removed Successfully...");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found..");
                }
            }

            // highest salary employee
            else if (choice == 4) {
                if (employee.isEmpty()) {
                    System.out.println("No employees found in the system.");
                } else {
                    Employee highestPaid = employee.get(0);

                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getSalary() > highestPaid.getSalary()) {
                            highestPaid = employee.get(i);
                        }
                    }
                    System.out.println("Highest Salary of an Employee is: ");
                    highestPaid.displayDetails();
                    System.out.println("Salary: " + highestPaid.getSalary());
                }
            }

            // Save the file
            else if (choice == 5) {
                Employee.saveEmployees(employee);
                System.out.println("Exiting Program..");
                break;
            }

            // Exit
            else if (choice == 6) {
                System.out.println("Exiting program....");
                break;
            }

            else {
                System.out.println("Invalid Input");
                break;
            }
        }
        sc.close();
    }
}
