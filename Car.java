public class Car {
    private String car_color;
    private String car_brand;
    private String fuel_type;
    private String mileage;

    public void start() {
        System.out.println("car is started");
    }

    public void stop() {
        System.out.println("car is stopped");
    }

    public void service() {
        System.out.println("car is for service");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.car_color = "blue";
        car.car_brand = "wolkswagen";
        car.fuel_type = "petrol";
        car.mileage = "40";
        car.start();
        System.out.println("car_color: " + car.car_color + " car_brand: " + car.car_brand + " fuel_type: " + car.fuel_type + " mileage: " + car.mileage);
        Car car_one = new Car();
        car_one.car_color = "grey";
        car_one.car_brand = "maruti suzuki";
        car_one.fuel_type = "petrol";
        car_one.mileage = "75";
        car_one.stop();
        System.out.println("car_color: " + car_one.car_color + " car_brand: " + car_one.car_brand + " fuel_type: " + car_one.fuel_type + " mileage: " + car_one.mileage);
        Car car_two = new Car();
        car_two.car_color = "white";
        car_two.car_brand = "Mercedes benz";
        car_two.fuel_type = "diesel";
        car_two.mileage = "45";
        car_two.service();
        System.out.println("car_color: " + car_two.car_color + " car_brand: " + car_two.car_brand + " fuel_type: " + car_two.fuel_type + " mileage: " + car_two.mileage);
        System.out.println("M.SAI MOKSHITHA");
    }
}