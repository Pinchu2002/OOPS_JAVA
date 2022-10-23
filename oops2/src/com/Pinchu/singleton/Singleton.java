package com.Pinchu.singleton;

public class Singleton {
    // private constructor
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj only is created  or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
