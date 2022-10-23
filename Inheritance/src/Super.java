class Base{
    public void display(){
        System.out.println("Base: display!");
    }
    public  void d1(){
        System.out.println("Base function!");
    }
}

class derived extends Base{
    @Override
    public void display() {
        System.out.println("Derived: display start!");
        super.display();
        System.out.println("Derived: display end!");
    }
    public void D(){
        System.out.println("Derived: display start!");
        super.d1();
        System.out.println("Derived: display ends!");
    }
}

public class Super {
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.d1();
    }
}
