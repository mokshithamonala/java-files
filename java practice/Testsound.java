abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Roar");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}

class Testsound {
    public static void main(String[] args) {
        System.out.println("Name: M.sai mokshitha, Rollno: AV.SC.U4CSE2451, Section: B");
        Lion l = new Lion();
        Tiger t = new Tiger();
        l.sound();
        t.sound();
    }
}