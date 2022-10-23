package pack1;

// Access Controls
public class A {

//    private int num;
//    Note: Default access modifier only allow access to same package
//    and does not allow to different packages!

    protected int num;// it will be accessible to subclasses
//    of same as well as different packages!
//    public int num;
    String name;
    int [] arr;

    // getter method
    public int getNum(){
        return num;
    }

    // setter method
    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
