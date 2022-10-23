package Abstract_Classes;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I want to be Fashion Designer!");
    }

    @Override
    void partner() {
        System.out.println("I love Cats!");
    }
}
