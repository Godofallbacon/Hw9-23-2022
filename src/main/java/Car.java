public class Car extends Vehicle {
    public Car(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);

    }

    @Override
    public void totalAfterTax() {
        System.out.println(totalBeforeTax() + calcTax());

    }
}
