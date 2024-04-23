interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card.");
    }
}

class BankTransferPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via Bank Transfer.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.50);

        cart.setPaymentStrategy(new BankTransferPayment());
        cart.checkout(200.75);
    }
}
