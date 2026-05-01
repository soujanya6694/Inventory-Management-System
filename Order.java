class Order {
    Product product;
    double totalAmount;

    Order(Product product) {
        this.product = product;
        this.totalAmount = product.price;
    }

    void displayOrder() {
        System.out.println("Order Details:");
        product.displayProduct();
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}