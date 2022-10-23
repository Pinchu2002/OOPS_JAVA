package com.Pinchu.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // static variables are independent of objects
    static long population;

    static void message(){
        System.out.println("Hello world!");
//        System.out.println(this.age); -> can't use this over here!
    }

    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }


}
