package oops2.prctice;

class Person{
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public Person(String name){

        this.name=name;

    }

    public void print(){
        System.out.println("name: "+this.name);
    }



}


public class encapsulation {

    public static void main(String [] args)
    {
        Person details=new Person("maddy");
        Person user=new Person("samy");

        details.print();
        user.print();

//        details.setName("madasamy");

//        System.out.println(details.getName());



    }
}
