class CardPayment implements Payment {
    double amount;

    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing Card Payment...");
    }

    public void displayReceipt() {
        System.out.println("Card Payment Done: ₹" + amount);
    }
}