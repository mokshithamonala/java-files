class calculator {
    public int add (inta,intb) {
        return a+b;
    }
}
public double add(double a,double b) {
    return a+b;
}
public int add(int a,int b, int c) {
   return a+b+c;
}
 public class calculator {
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println("sum of 20 and 50:"+calc.add(20,50));
        System.out.println("sum of3.5 and 6.2:"+calc.add(3.5,6.2));
        System.out.println("sum of 20,and 30 and 20:"+calc.add(20,30,20));
    }
 }