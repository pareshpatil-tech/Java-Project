class Person {
    private String name;
    private int age;
    private double amount;
    private int accountNumber;
    private double balance;
    private double interestRate;
    private double overdraftLimit;

public void getDetails() {
    System.out.println("Name:"+ name);
    System.out.println("Age:"+ age);
    System.out.println("Amount: "+ amount);
   
   }
public void setDetails(String name, int age, double amount) {
    this.name= name;
    this.age=age;
    this.amount=amount;
  }
}
//Bank Management System...


class Account extends Person {
    int  accountNumber;
    double balance;
}
class SavingsAccount extends Account {
    double interestRate;
}
class CurrentAccount extends Account {
    double overdraftLimit;
}

public class Project09 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.setDetails("Paresh PAtil", 19, 12009.56);
        s1.accountNumber=602435678;
        s1.balance=45677899.78;
        s1.interestRate=5.9;
        System.out.println("\n --Savings Account Details--");
        s1.getDetails();

        CurrentAccount c1 = new CurrentAccount();
        c1.setDetails("Shlok Patil", 18, 34000.78);
        c1.accountNumber=45678934;
        c1.balance=560000.45;
        System.out.println("\n --Current Account Details--");
        c1.overdraftLimit=1000.98;
        c1.getDetails();



    }
}