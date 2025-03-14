package oops_prac;

class Details{
    static int b=20;
    static  int a=10;


    static void printed(){
        int c=a+b;
        System.out.println("answer: "+c);
    }
}

public class Static_methods {
    public static void main(String [] args){
        Details.printed();
    }
}
