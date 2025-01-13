package codesmells.discountCalculator;

class Order {
    private final double totalPrice;

    public Order(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
