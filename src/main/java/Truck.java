public class Truck extends Vehicle{

    public Truck(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);
    }


    @Override
    public void totalAfterTax() {
        System.out.println(totalBeforeTax() + calcTax());
    }
}
