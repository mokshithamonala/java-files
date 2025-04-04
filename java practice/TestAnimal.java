class Animal{
 void eat(){
System.out.println("iam king");
 }
}
class Herbivores extends Animal{
 void eat(){
System.out.println("cow and deer are herbivores");
 }
}
class carnivores extends Animal{
    void eat(){
        System.out.println("bears and pigs are carnivores");
    }
}
class omnivores extends Animal{
    void eat(){
        System.out.println("human and rats are omnivores");
    }
}
class TestAnimal{
    public static void main(String[] args){
        System.out.println("Name:M.sai mokshitha,Rollno:AV.SC.U4CSE2451,Section:B");
        Animal a=new Animal();
        a.eat();
        Animal b=new Herbivores();
        b.eat();
        Animal c=new carnivores();
        c.eat();
        Animal d=new omnivores();
        d.eat();

    }
}
