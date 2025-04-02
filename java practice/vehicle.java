class Vehicle {
    public String car_model;
    public String color;
    public String fuel_type;
    
    public Vehicle(String car_model, String color, String fuel_type) {
        this.car_model = car_model;
        this.color = color;
        this.fuel_type = fuel_type;
    }

    void displayInfo() {
        System.out.println("car_model: " + car_model);
        System.out.println("car_color: " + color);
        System.out.println("car_fuel_type: " + fuel_type);
        System.out.println("I have an Audi car");
    }
}

class Car extends Vehicle {
    public Car(String car_model, String color, String fuel_type) {
        super(car_model, color, fuel_type);
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("I have a Benz car");
    }
}

public class Truck {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Audi", "Red", "Petrol");
        v.displayInfo();
        
        Car c = new Car("Benz", "Black", "Diesel");
        c.displayInfo();
    }
}