package com.Pinchu.staticExample;

public class Main {

    public static void main(String[] args) {
//        Human Pinchu = new Human(20,"Priyanshu ",10000,false);
//        Human Deepu = new Human(24,"Deepanshu", 14000,false);
//        Human Chetan = new Human(34,"Chetan", 30000,true);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
    }

    // this is not dependent on objects
    static void fun(){
        //greeting(); --> we cannot call non-static func into a static func. As static func are object independent!

        // you cannot access non-static stuff without referencing their instances in a static context!

        // hence, I'm referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // we know that something that is not static, belongs to objects
    void greeting(){
        System.out.println("Hemlo World!");
    }
}
