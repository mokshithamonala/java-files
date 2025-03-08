class GrandFather {
    public String moral;
    public double value;

    void money() {
        System.out.println("Money and Ethics");
    }
}

class Father extends GrandFather {
    public String car;
    public int houses;
    void car() {
        System.out.println("Car and 3Houses");
    }
}

class Son extends Father {
    public String ornaments;

    void Ornaments() {
        System.out.println("Gold and Diamonds");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son(); 
        
        
        s.money();        
        s.car();         
        s.Ornaments(); 
    }
}

  