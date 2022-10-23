package com.example;
import java.util.Arrays;
public class object_oriented {
    public static void main(String[] args){

        // store 5 roll nos
        int [] numbers = new int[5];

        // store 5 names
        String [] names = new String[5];

        Student [] students = new Student[5];

        // just declaring
        Student student = new Student(219,"Priyanshu Chhabda",85.8f);

//        student.rno = 219;
//        student.name = "Priyanshu Chhabda";
//        student.marks = 85.8f;

//        student.changeName("Pinchu");
//        student.greeting();
//        Student s1 = new Student();

        Student random = new Student(student);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);
    }
}

// create a class
// for every single student
class Student{
    int rno;
    String name;
    float marks;

    void greeting (){
        System.out.println("Hello!, My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // constructor overloading
    Student(){
//        this.rno = 1;
//        this.name = "Naam";
//        this.marks = 1.0f;
        // this is how you call constructor from another constructor
        this(12,"PC", 51.0f);
    }
}
