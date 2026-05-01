import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        // Create product
        Product p1 = new Product(name, price);
        p1.displayProduct();

        // Create order
        Order order = new Order(p1);
        order.displayOrder();

        // Payment choice
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Cash\n2. Card\n3. UPI");

        int choice = sc.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CashPayment();
        } else if (choice == 2) {
            payment = new CardPayment();
        } else {
            payment = new UPIPayment();
        }

        // Process payment
        payment.processPayment(price);

        System.out.println("\n===== BILL RECEIPT =====");
order.displayOrder();
payment.displayReceipt();
System.out.println("========================");
    }
}
