class Parent {
    public String moral;
    public double value;

    void money() {
        System.out.println("Money and Ethics");
    }
}

class Child extends Parent {
    public String car;
    public int houses;
    public String jewelry;
    public String profession;

    void details() {
        System.out.println("Car and 3 Houses");
        System.out.println("Profession and Jewelry");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        
        child.money();
        child.details();
    }
}
