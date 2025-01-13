package codesmells.discountCalculator;

class DiscountService {
    public double applyDiscount(double price) {
        if (price > 100) {
            price *= 0.9;
        }
        if (price > 200) {
            price -= 10;
        }
        return price;
    }
}
