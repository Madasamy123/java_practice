package oops_prac;

abstract class shape{
    abstract double calculatearea();
}

class rectangle extends shape{

    double length;
    double breath;

    public rectangle(double length, double breath){
         this.length=length;
         this.breath=breath;

    }

    public double calculatearea(){
         return length*breath;
    }


}

 class circle extends shape{

    double radius;
    final double pi=3.14;

    public circle(double radius){
        this.radius=radius;
    }

    public double calculatearea(){
        return pi*radius*radius;
    }



}

public class abstract_prac1 {

    public static void main(String [] args){
        shape rect=new rectangle(5, 5);
        System.out.println("rectangle: "+rect.calculatearea());

        shape circ=new circle(14);
        System.out.println("circle: "+circ.calculatearea());




    }
}
