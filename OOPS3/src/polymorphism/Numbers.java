package polymorphism;

public class Numbers {

    // method overloading
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        int s1 = obj.sum(8,5);
        int s2 = obj.sum(3,4,5);
        System.out.println(s1);
        System.out.println(s2);
    }
}
