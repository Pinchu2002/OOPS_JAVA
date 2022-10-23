package pack2;

import pack1.A;

public class B {
    public static void main(String[] args) {
        A a = new A(5,"Deepu");
        a.getNum();
//        a.num; it has private access thus it gives an error!
        int n = a.num; // this will not give error as it is public!
    }
}
