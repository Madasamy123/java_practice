package OOPSMain;

// Interface defining vehicle behavior
interface Vehicle {
    void start(); // Abstract method (no body)
    void stop();
}

// Car class implementing Vehicle interface
class Cars implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops by applying brakes.");
    }
}
// Bike class implementing Vehicle interface
class Bikes implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops by applying disc brakes.");
    }
}

public class interface1 {
    // Main class

        public static void main(String[] args) {
            Vehicle myCar = new Cars();
            myCar.start();
            myCar.stop();

            System.out.println("----------------------");

            Vehicle myBike = new Bikes();
            myBike.start();
            myBike.stop();

    }
}
