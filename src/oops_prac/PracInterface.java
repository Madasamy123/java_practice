package oops_prac;

interface Students{
    void printdet(String name);
}


class Address implements Students{
    @Override
    public void printdet(String name){


        System.out.println("Enter Your name: "+name);

}
}

class parentDet implements Students{
    @Override
    public void printdet(String name){
        System.out.println("Enter your father: "+name);
    }

}

public class PracInterface {
public static void main(String [] args) {


    Students sd = new Address();
    sd.printdet("maddy");
    Students fd=new parentDet();
    fd.printdet("asokan");

}

    }

