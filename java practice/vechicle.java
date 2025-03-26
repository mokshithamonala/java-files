 class vechicle {
     public car_model;
     public string color;
     public fuel_type;
      this.car_model=car_model;
      this.color=color;
      this.fuel_type= fuel_type;
      void displayInfo() {
      System.out.println("car_model:"+car_model);
      System.out.println("car_color:"+car_color);
      System.out.println("car_fuel_type:"+fuel_type);
      System.out.println("ihave an audi car");
    }
}
  class car extends vechicle {
      this.car_model=car_model;
      this.color=color;
      this.fuel_type= fuel_type;
      void displayInfo() {
       System.out.println("i have an benz car");
     }
}
  class truck {
    public static void main(String[]args) {
      vehicle v=new vehicle(car_model:"hyundai",car_color:"red",fuel_type:"petrol");
      v.displayInfo();
    }
  }
     
     