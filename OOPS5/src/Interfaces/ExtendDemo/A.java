package Interfaces.ExtendDemo;

public interface A {
//    void fun();

    // Java8 has new functionality. It give us the functionality through which we can make default functions
//  for abstract classes
    default void fun(){
        System.out.println("This is A Interface!");
    }

//    NOTE: "Static Methods are independent of objects. Thus, they must have body while their implementation!"
//    static void greetings(); this is not allowed!
     static void greetings(){
         System.out.println("Hello! frnds");
     }
}
