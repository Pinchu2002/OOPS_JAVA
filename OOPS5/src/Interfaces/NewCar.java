package Interfaces;

public class NewCar {
    private Engine engine;
    private Media media = new Alexa();
    public NewCar(){
        engine = new PowerEngine();
    }

    public NewCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        media.stop();
    }

   public void startMusic(){
        media.start();
   }

   public void stopMusic(){
        media.stop();
   }

   public void upgradeEngine(){
        this.engine = new ElectricEngine();
   }

}

