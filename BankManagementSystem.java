import java.util.Scanner;

class Person {
    Scanner sc = new Scanner(System.in);
    String History = "";
    private String name;
    private int age;
    private double amount;
    private double balance;

    public void getDetails() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Available Balanace: " + balance + " Rs.");

    }

    public void setDetails(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. please enter a correct amount.");
            amount = sc.nextDouble();
        } else {
            balance += amount;
            System.out.println("--Deposit succesfull.--");
            System.out.println("New balance: " + balance);
            History += "Deposited: " + amount + "Rs. \n";
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount. Please enter the coorect amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Please enter the correct amount.");

        } else {
            balance -= amount;
            System.out.println("--Withdrawal Succesfull.--");
            System.out.println("Updated Balance: " + balance);
            History += "Withdrew: " + amount + "Rs. \n";
        }
    }

    public void TransactionHistory() {
        System.out.println("-----Transaction History-----");
        System.out.println(History);

    }

}
// Bank Management System...

class Account extends Person {
    int accountNumber;
    double balance;
    double deposit;
    double withdraw;
}

class SavingsAccount extends Account {
    double interestRate;
}

class CurrentAccount extends Account {
    double overdraftLimit;
}

public class BankManagementSystem {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.setDetails("Paresh Patil", 19, 2000);
        s1.accountNumber = 602435678;
        s1.balance = 2000;
        s1.interestRate = 5.9;
        System.out.println("\n -----Savings Account Details-----");
        s1.deposit(2500);
        s1.withdraw(500);
        s1.TransactionHistory();
        s1.getDetails();

        CurrentAccount c1 = new CurrentAccount();
        c1.setDetails("Shlok Patil", 18, 4000);
        c1.accountNumber = 400056789;
        c1.balance = 4000;
        System.out.println("\n -----Current Account Details-----");
        c1.overdraftLimit = 1000.98;
        c1.deposit(4000);
        c1.withdraw(1000);
        c1.TransactionHistory();
        c1.getDetails();
    }
}