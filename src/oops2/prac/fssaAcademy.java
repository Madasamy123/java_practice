package oops2.prac;

public class fssaAcademy extends collegeStudents {

    private  String learning;
    private String projectName;

    private int overAllScore;

    public void setLearning(String learning){
        this.learning=learning;
    }
    public String getLearning(){
        return this.learning;
    }
    public void setProjectName(String projectName){
        this.projectName=projectName;
    }
    public String getProjectName(){
        return this.projectName;
    }

    public void setOverAllScore(int overAllScore){
        this.overAllScore=overAllScore;
    }
    public int getOverAllScore(){
        return this.overAllScore;
    }


    public fssaAcademy(){

    }


    public fssaAcademy(String name, int age, String department,int fluidMech,int chemistry,String learning,String projectName,int overAllScore){

        super(name,age,department,fluidMech,chemistry);
         this.learning=learning;
         this.projectName=projectName;
         this.overAllScore=overAllScore;
    }

    public void printDetails(){
      super.printDetails();

        System.out.println("Learning "+this.learning);
        System.out.println("projectName "+this.projectName);
        System.out.println("academyOverall "+this.overAllScore);

    }




}
