package oops2.prctice;

class Studentslist{
    private String name;
    private int age;
    private double engMarks;

    public Studentslist(){

    }

    public void setName(String name){
        this.name=name;

    }

    public void setAge(int age){
        this.age=age;
    }

    public void setMarks(double engMarks){
        this.engMarks=engMarks;

    }


    public String getName(){
        return this.name;
    }


    public int getAge(){
        return this.age;
    }

    public double getMarks(){
        return this.engMarks;
    }

    public Studentslist(String name,int age,double engMarks){
        this.name=name;
        this.age=age;
        this.engMarks=engMarks;
    }

    public void print(){
        System.out.println("name"+this.name);
        System.out.println("age"+this.age);
        System.out.println("marks"+this.engMarks);
    }



}


public class example {

    public static void main(String [] args)
    {
        Studentslist details=new Studentslist("madasamy",22,78);
        Studentslist st2=new Studentslist("sudharsan",21,90);
        Studentslist st3=new Studentslist("dfghjk",21,90);

//        details.setName("maddy");
//        details.setAge(22);
//        details.setMarks(56);


//        System.out.println(details.getName());
//        System.out.println(details.getAge());
//        System.out.println(details.getMarks());

        st2.print();
        st3.print();
        details.print();
    }
}
