public class Main {
    public static void main(String[] args) {

        Car car = new Car("M5", 25000, 1, 95.0f);
        Bike bike = new Bike("R1", 19000, 1, 85.0f);
        Horse horse = new Horse("Pony", 3000, 1, 25.0f);
        Truck truck = new Truck("Raptor", 23000, 1, 77.0f);

        RollerCoaster rollerCoaster = new RollerCoaster(20.0,25.0f);

       rollerCoaster.rollerCoasterAfterTax();

        Vehicle [] vehicles = {car, bike, truck, horse};
       for(Vehicle x : vehicles){
        //System.out.println(x.calcTax());
        }
       // truck.totalAfterTax();
     //  car.totalAfterTax();
      // horse.totalAfterTax();
     //  bike.totalAfterTax();
      //  Rideable [] rideables = {rollerCoaster, bike, horse};

    }
}
