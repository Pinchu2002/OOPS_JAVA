package inheritance;

//inheritance
public class box {
     double l;
     double h;
     double w;
     double weight;
     box(){
//         super();  --> this will refers to object superclass (predefined in java)!
         this.h = -1;
         this.l = -1;
         this.w = -1;
     }

     box(double side){
         this.w = side;
         this.h = side;
         this.l = side;
     }

     box(double l, double h, double w){
         this.l = l;
         this.h = h;
         this.w = w;
     }

     box(box old){
         this.h = old.h;
         this.l = old.l;
         this.w = old.w;
     }

     static void greetings(){
         System.out.println("Hey! I'm in box class.");
     }

    public void information(){
        System.out.println("Running the inheritance.box");
    }
}
