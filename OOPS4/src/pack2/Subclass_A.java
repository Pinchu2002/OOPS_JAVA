package pack2;
import pack1.A;
public class Subclass_A extends A{
    public Subclass_A(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass_A obj1 = new Subclass_A(4,"pinchu");
        A obj2 = new A(5,"deepu");
        int n1 = obj1.num;
//        int n2 = obj2.num; this will give an error as protected
//        modifiers are only accessible by subclasses in different packages!
    }
}
