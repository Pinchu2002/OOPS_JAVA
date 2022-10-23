package Abstract_Classes;

// Abstract Classes
public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    static void hello(){
        System.out.println("Hello!");
    }

    // abstract classes - you have to just declare it in base class
    // then you have to declare them in the child class.

}
