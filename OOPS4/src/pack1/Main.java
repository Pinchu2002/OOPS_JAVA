package pack1;

import pack1.A;

public class Main {
    public static void main(String[] args) {
        A obj = new A(44,"Pinchu");
//        int n = obj.num; this will give an error as num is private!
        System.out.println(obj.getNum() + " " + obj.name);
        obj.setNum(40);
        System.out.println(obj.getNum() + " " + obj.name);
    }
}
