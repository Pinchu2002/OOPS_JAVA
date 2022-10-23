package com.Pinchu.staticExample;

// note - Outside classes cannot static as they are not depended on any class!
//static class A{
//
//}

//class Test{
//    static String name;
//    Test(String name){
//        Test.name = name;
//    }
//}

public class Innerclass {
    // But Inner classes can be static!
    // If inner class is non-static then when we create object of it will show an error!
    // As Test class also depends on its parent class i.e. Innerclass!
    // Note - if we put non-static Test class outside the Innerclass then its objects can be created!
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }

        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Pinchu");
        Test b = new Test("Kunal");

        System.out.println(a);
        System.out.println(b);
    }
}
