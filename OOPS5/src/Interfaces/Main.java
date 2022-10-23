package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.start();
//        car.acc();
//        car.brake();
//        car.stop();
//        Media carmedia = new Car();
//        carmedia.stop();

        NewCar car2 = new NewCar();
        car2.start();
        car2.startMusic();
        car2.upgradeEngine();
        System.out.println("Engine Upgraded!");
        car2.start();
    }
}
