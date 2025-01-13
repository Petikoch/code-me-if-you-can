package codesmells.discountCalculator;

class DiscountManager {
    private final Order order;

    public DiscountManager(Order order) {
        this.order = order;
    }

    public double calculateFinalPrice() {
        DiscountService discountService = new DiscountService();
        return discountService.applyDiscount(order.getTotalPrice());
    }
}
