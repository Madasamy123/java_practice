package oops2.prac;



//  class definition

 class StudentDetails {


    private String name;
    private int age;
    private String department;


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }


    public void setDepartment(String department){
        this.department=department;
    }

    public String getDepartment(){
        return this.department;
    }

    public StudentDetails(){


    }

    //  constructor

    public StudentDetails(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;

    }

    //  method (behaviour)

    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("department: "+this.department);
    }




}
