public class myclass {
    static int count = 0;
    final double pi = 3.14;
    public myclass() {
        count++;
    }
    public static void main(String[] args) {
        myclass a = new myclass();
        myclass b = new myclass();
        myclass c = new myclass();
        myclass d = new myclass();
        myclass e = new myclass();

        System.out.println("count: " + count);
        System.out.println("Value of pi:"+a.pi); 
        System.out.println("Value of pi:"+b.pi);
        System.out.println("Value of pi:"+c.pi);
        System.out.println("Value of pi:"+d.pi);
        System.out.println("Value of pi:"+e.pi);
    } 
}