class base{
    int j;
    base(){
        j  = 11;
    }
    void disp(){
        System.out.println("J is: " + j) ;
    }
}

interface i
{
    int con=10;
    void inter_f1(); // by default, it will be abstract function
}

class derived extends base implements i{
    int i;
    derived(){
        i = 20;
    }
//    void inter_f1(){
//        System.out.println("Defining of inter_f1()");
//    }
}

// abstract class
abstract class parent1{
    void f1(){
        System.out.println("Abstract class parent1!");
    }
}
class child extends parent1{
    void f2(){
        System.out.println("Child start!");
        super.f1();
        System.out.println("Child end!");
    }
}


public class multiple_inheritance {
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.disp();
//        parent p1 = new parent(); --> since this an abstract class it does not allow to make object of it!
//        child c1 = new child();
//        c1.f2();
    }
}

