public class Bike extends Vehicle implements Rideable{
    public Bike(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);

    }


    @Override
    public void totalAfterTax() {
        System.out.println(totalBeforeTax() + calcTax());

    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}