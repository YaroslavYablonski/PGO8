public class Main {
    public static void main(String[] args) {
        Car car = new Car("BLA", "BLABLA", 2000, 1000, 50);
        Truck truck = new Truck("BLA", "BALBLA", 2020, 700, 60, 4);

        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles/gallon");
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles/gallon");
    }
}