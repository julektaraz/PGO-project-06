public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 1000, 30);
        System.out.println("Car fuel efficiency: " + myCar.calculateFuelEfficiency());

        Truck myTruck = new Truck("Ford", "F-150", 2022, 800, 40, 2.5);
        System.out.println("Truck fuel efficiency: " + myTruck.calculateFuelEfficiency());
    }
}
