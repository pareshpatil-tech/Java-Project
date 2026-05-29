//Payment System using Interaface...

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("UPI payment successfull: "+amount);
    }
    public void refund(double amount) {
        System.out.println("UPI refunded succesfull: "+amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Card payment successfull: "+amount);
    }
    public void refund(double amount) {
        System.out.println("Card refunded succesfull: "+amount);
    }
}

public class Project10 {
    public static void main(String[] args) {
        UPIPayment upi= new UPIPayment();
        CardPayment card = new CardPayment();

        upi.pay(5000);
        upi.refund(3500);
        card.pay(9000);
        card.refund(3000);

        

    }
}