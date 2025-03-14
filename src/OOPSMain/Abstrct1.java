package OOPSMain;

abstract class vechile{
    // abstract method

    abstract void start();
    abstract void stop();

    // concrete method (common for all)

    void petrolCheck(){
        System.out.println("Fuel is full");
    }

}

// car class extends vechile

 class Car extends vechile{

    void start(){
        System.out.println("car start with a key");
    }

    void stop(){
        System.out.println("car is stopping by appling breaks");
    }

}
 class Bike extends vechile{

    void start(){
        System.out.println("bike started with a key");
    }

    void stop(){
        System.out.println("bike stoped with a brake");
    }
}

public class Abstrct1 {
    public static void main(String[] args) {

        vechile c1=new Car();
        c1.start();
        c1.stop();
        c1.petrolCheck();

        vechile b1=new Bike();
        b1.start();
        b1.stop();
        b1.petrolCheck();
    }
}
