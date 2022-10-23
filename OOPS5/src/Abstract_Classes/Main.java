package Abstract_Classes;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(20);
        son.career();

        Daughter dau = new Daughter(19);
        dau.career();

        Parent.hello();
//        Abstract_Classes.Parent mom = new Abstract_Classes.Parent(); --> Since Abstract_Classes.Parent Class is abstract class. Thus, you can't create its object!
    }
}
