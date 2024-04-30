// Interface untuk strategi pembayaran
interface PaymentStrategy {
    void pay(double amount);
}

// Implementasi strategi pembayaran menggunakan kartu kredit
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card.");
        // Logika pembayaran dengan kartu kredit
    }
}

// Implementasi strategi pembayaran menggunakan transfer bank
class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankCode;

    public BankTransferPayment(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via Bank Transfer.");
        // Logika pembayaran dengan transfer bank
    }
}

// Kelas yang berperan sebagai context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

// Main class sebagai tempat untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Memilih strategi pembayaran menggunakan kartu kredit
        cart.setPaymentStrategy(new CreditCardPayment("1234 5678 9012 3456", "12/24", "123"));
        cart.checkout(100.50); // Melakukan pembayaran

        // Memilih strategi pembayaran menggunakan transfer bank
        cart.setPaymentStrategy(new BankTransferPayment("1234567890", "BANK123"));
        cart.checkout(200.75); // Melakukan pembayaran
    }
}
