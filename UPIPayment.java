class UPIPayment implements Payment {
    double amount;

    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing UPI Payment...");
    }

    public void displayReceipt() {
        System.out.println("UPI Payment Done: ₹" + amount);
    }
}