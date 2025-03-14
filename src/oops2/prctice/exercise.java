package oops2.prctice;

class cars{        // (Blueprint for objects)
    String brand;
    String color;
    int speed;


    //  constructor  -   Assign values when creating an object

    public cars(String brand,String color,int speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }

    // Method (Behavior)
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    void brake() {
        System.out.println(brand + " is stopping.");
    }






}





public class exercise {

    public static void main(String [] args){

        //  creating objects from class

        cars car1=new cars("toyoto","black",130);
        cars car2=new cars("audi","white",150);


        // Accessing object Attributes

        System.out.println(car1.brand + " - " + car1.color);
        System.out.println(car2.brand + " - " + car2.color);


        // Calling Object Methods
        car1.drive();
        car2.drive();
        car1.brake();
        car2.brake();
    }

}
