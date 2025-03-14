package oops2.prac;

public class collegeStudents extends StudentDetails {

    private int fluidMech;
    private int chemistry;

    public void setFluidMech(int fluidMech){
        this.fluidMech=fluidMech;
    }

    public int getFluidMech(){
        return this.fluidMech;
    }

    public void setChemistry(int chemistry){
        this.chemistry=chemistry;
    }

    public int getChemistry(){
        return this.chemistry;
    }

    public collegeStudents(){

    }



    public collegeStudents(String name,int age,String department,int fluidMech,int chemistry){

        super(name,age,department);
        this.fluidMech=fluidMech;
        this.chemistry=chemistry;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Name: "+this.fluidMech);
        System.out.println("Name: "+this.chemistry);
    }


}
