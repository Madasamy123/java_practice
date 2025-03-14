package oops_prac;

//  abstract class (contains abstract methods)
abstract class vechile{
    abstract void start();     // Abstract method (no implementation)

}


//  concrete class(provides implementation for abstract method)

//  concrete class that extends the abstract class


class  Carm extends vechile{

    // Providing implementation for the abstract method
    void start(){
        System.out.println("car starts with a key");
    }

}
public class abstract_prac {

    public static void main(String [] args){

//        // Animal obj = new Animal(); ❌ Error: Cannot create object of abstract class


        vechile cardet=new Carm();   // creating object of subclass
        cardet.start();

    }
}
