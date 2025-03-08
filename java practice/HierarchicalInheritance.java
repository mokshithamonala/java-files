class GrandParent {
    public String moral;
    public double value;

    void money() {
        System.out.println("Money and Ethics");
    }
}

class Father extends GrandParent {
    public String car;
    public int houses;

    void carDetails() {
        System.out.println("Car and 3 Houses");
    }
}

class Mother extends GrandParent {
    public String jewelry;
    public String profession;

    void professionDetails() {
        System.out.println("Profession and Jewelry");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Father father = new Father();
        Mother mother = new Mother();

        
        father.money();
        father.carDetails();

       
        mother.money();
        mother.professionDetails();
    }
}