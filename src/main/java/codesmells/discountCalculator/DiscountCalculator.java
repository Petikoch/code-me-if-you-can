package codesmells.discountCalculator;

public class DiscountCalculator {
    public static void main(String[] args) {
        Order order = new Order(150);
        DiscountManager discountManager = new DiscountManager(order);
        double finalPrice = discountManager.calculateFinalPrice();
        System.out.println("Final Price: " + finalPrice);
    }
}
