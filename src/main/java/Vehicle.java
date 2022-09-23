public abstract class Vehicle extends Product {
    private double price;
    private int qty;
    private float speed;
    private final double tax = 0.15;
    private Engine engine;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Vehicle(String name, double price, int qty, float speed) {
        super(name);
        this.price = price;
        this.qty = qty;
        this.speed = speed;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return price*qty;


    }
    public double calcTax(){
        return price*tax;


    }

    public abstract void totalAfterTax(Vehicle vehicle);

    public abstract void totalAfterTax();
}
