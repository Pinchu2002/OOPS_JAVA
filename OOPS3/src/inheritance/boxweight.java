package inheritance;

// Subclass of inheritance.box
public class boxweight extends box {
    double weight;

    public boxweight(){
        this.weight = -1;
    }

    boxweight(boxweight other){
//        super(other); --> this is same as inheritance.box b4 = new inheritance.boxweight(5,6,7,2);
        weight = other.weight;
    }

    boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public boxweight(double l, double h, double w, double weight){
        super(l,h,w); // calls the parent class constructor
        // used to initialize values present in parent class

//        System.out.println(super.weight); --> this will refers to base weight
//        System.out.println(this.weight);  --> while this will refer to child weight
        this.weight = weight;
    }


}
