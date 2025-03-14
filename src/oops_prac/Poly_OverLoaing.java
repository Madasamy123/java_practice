package oops_prac;

class calculation{

    //  // Method with one parameter


    void add(int a){
        System.out.println("addition: "+(a+10));

    }

    // Method with two parameters

    void add(int a, int b){
        System.out.println("addition: "+(a+b));
    }
}

public class Poly_OverLoaing {

    public static void main(String [] args){
        calculation addNum=new calculation();
        addNum.add(10);
        addNum.add(10,15);
    }
}
