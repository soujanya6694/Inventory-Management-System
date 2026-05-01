class CashPayment implements Payment {
    double amount;

    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing Cash Payment...");
    }

    public void displayReceipt() {
        System.out.println("Cash Payment Done: ₹" + amount);
    }
}