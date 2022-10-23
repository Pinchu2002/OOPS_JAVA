package Human;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        int Salary = sc.nextInt();
        boolean married = sc.nextBoolean();
        Stat Human = new Stat(age, name ,Salary, married);
        System.out.println("Following are the information given");
        System.out.println("Name:- "+Human.name);
        System.out.println("Age:- "+Human.age);
        System.out.println("Salary:- "+Human.Salary);
        System.out.println("Married:- "+Human.married);
    }
}

