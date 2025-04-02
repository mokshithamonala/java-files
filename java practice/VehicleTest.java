import java.util.Scanner;

class Vehicle {
    public String make;
    public String model;
    public int year;
    public String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void fuelEfficiency() {
        System.out.println("Trucks generally have lower fuel efficiency.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void distanceTravelled(int speed, int time) {
        int distance = speed * time;
        System.out.println("Distance traveled: " + distance + " km");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void maximumSpeed(int maxSpeed) {
        System.out.println("Maximum speed: " + maxSpeed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel");
        Car car = new Car("Toyota", "Corolla", 2023, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2021, "Petrol");

        truck.displayInfo();
        truck.fuelEfficiency();

        car.displayInfo();
        car.distanceTravelled(80, 2);

        motorcycle.displayInfo();
        motorcycle.maximumSpeed(200);
    }
}
