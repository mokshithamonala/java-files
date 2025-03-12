public class Caluclator{
    public int add(int a, int b){
         int add=a+b;
        return add;
    }
    public int subtract(int a,int b){
         int subtract=a-b;
        return subtract;
    }
    public int multiply(int a,int b){
         int multiply=a*b;
         return multiply;
    }
    public float divide(int a,int b){
         int divide=a/b;
        return divide;
    }
    public static void main(String args[]){
    Caluclator obj=new Caluclator();
    int add=obj.add(1,2);
    int subtract=obj.subtract(10,2);
    int multiply=obj.multiply(2,3);
    float divide=obj.divide(10,2);
    System.out.println("add:"+add);
    System.out.println("subtract:"+subtract);
    System.out.println("multiply:"+multiply);
    System.out.println("divide:"+divide);
    }
}