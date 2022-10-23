package Interfaces.ExtendDemo;

public class Main implements B{

// Since B extends A thus it became sub-interface of A.
// As Main implements B thus it must override both the functions!
    @Override
    public void greet() {
        System.out.println("Greetings!");
    }
}
class M{
    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
        m.greet();
        A.greetings();
    }
}