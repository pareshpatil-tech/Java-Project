//Payment System using Interaface...

interface Payment {
    void pay(double amount);

    void refund(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("UPI payment successfull: " + amount);
    }

    public void refund(double amount) {
        System.out.println("UPI refunded succesfull: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Card payment successfull: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Card refunded succesfull: " + amount);
    }
}

class CryptoPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Crypto Payment Payment Succesfull: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Crypto Payment Refunded Sucesfull: " + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        CryptoPayment crypto = new CryptoPayment();

        System.out.println("\n-----UPIPayment-----");
        upi.pay(5000);
        upi.refund(3500);
        System.out.println("\n-----CardPayment-----");
        card.pay(9000);
        card.refund(3000);
        System.out.println("\n-----CryptoPayment-----");
        crypto.pay(7000);
        crypto.refund(2000);

    }
}