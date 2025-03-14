package oops_prac;

class multiplication{

    static int a=10;
    static int b=20;

    public void print(){
        int c=a*b;
        System.out.println(c);
    }

}

public class Static_variables {
    public static void main(String [] args){
        multiplication mul=new multiplication();
        mul.print();


    }
}
