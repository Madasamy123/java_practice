package oops2.prac1;

import oops2.prac1.peopleDet;

class FullDetails extends peopleDet {
    private int age;
    public String gender;

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public FullDetails(){

    }
    public FullDetails(String name,String Address,int YearIncome,int age,String gender){
        super(name,Address,YearIncome);
        this.age=age;
        this.gender=gender;
    }

    public void printDet(){
        super.printDet();

        System.out.println("age: "+age);
        System.out.println("gender: "+gender);

    }
}


