package inheritance;

public class Main {
    public static void main(String[] args) {
//        inheritance.box b1 = new inheritance.box();
//        inheritance.box b2 = new inheritance.box(4.6,5.7,8.0);
//        inheritance.box b3 = new inheritance.box(b1);
//        System.out.println(b1.l + " " + b1.h + " " + b1.w);
//        System.out.println(b2.l + " " + b2.h + " " + b2.w);

//        inheritance.boxweight b1 = new inheritance.boxweight();
//        inheritance.boxweight b2 = new inheritance.boxweight(4.5,5.5,6.7,9.2);
//        System.out.println(b1.h + " " + b1.weight);

//        inheritance.box b4 = new inheritance.boxweight(5,6,7,2);
//        System.out.println(b4.w); --> this will not give an error as b4 is referencing to inheritance.box class!
//        System.out.println(b4.weight); --> while this give an error as weight is property of child class and b4 is referencing to inheritance.box class!

//        inheritance.boxweight b5 = new inheritance.box(5,7,6); --> this will also give error as inheritance.box constructor does not know about the weight variable!
//        boxprice b6 = new boxprice(5,8,3);
//        System.out.println(b6.l + " " + b6.h + " "+ b6.w + " " + b6.weight + " " + b6.cost);

        boxweight box = new boxweight();
        box.greetings(); // Note: Static Methods cannot be overridden (Thus You can Inherit, but you can't override it!)
    }
}
