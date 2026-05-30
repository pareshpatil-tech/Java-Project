import java.lang.Thread;

//ATM Withdrawal Simulator with sychroniztion.......
class BankAccount {
    private int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance = balance - amount;

            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ATM implements Runnable {
    BankAccount account;

    ATM(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(800);
    }

}

public class ATMWithdrawalSimulator {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        ATM atm1 = new ATM(b1);
        ATM atm2 = new ATM(b1);

        Thread user1 = new Thread(atm1, "Paresh Patil");
        Thread user2 = new Thread(atm2, "Shlok Patil");

        user1.start();
        user2.start();
    }
}