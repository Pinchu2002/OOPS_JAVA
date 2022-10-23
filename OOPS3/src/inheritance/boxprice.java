package inheritance;

// Subclass of inheritance.boxweight
public class boxprice extends boxweight{
    double cost;

    boxprice(){
        this.cost = -1;
    }

    boxprice(boxprice other){
        this.cost = other.cost;
    }

    boxprice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }

    boxprice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }


}
