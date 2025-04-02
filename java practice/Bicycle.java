class vehicle {
    public String make;
    public String model;
    public int year;
    public String fueltype;

    
    public vehicle(String make, String model, int year, String fueltype) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
    }
}

class Truck extends vehicle {
    void fuelefficiency() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fueltype);
    }

}
class Car extends vehicle{
    void distancetravelled() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fueltype);
    }

    }

class motorcycle extends vehicle{
    void maximumspeed() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fueltype);
    }

}
class Bicycle{
    public static void main(String[] args) {
      Truck t=new Truck();
      Car c=new Car();
      Motorcycle m=new Motorcycle();
      t.fuelefficiency();
      c.distancetravelled();
      m.maximumspeed();
    }
  }
