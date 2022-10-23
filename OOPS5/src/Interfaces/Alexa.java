package Interfaces;

public class Alexa implements Media{

    @Override
    public void start() {
        System.out.println("Alexa! Play Music");
    }

    @Override
    public void stop() {
        System.out.println("Alexa! Stop Music");
    }
}
