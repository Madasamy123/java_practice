
 class Students{
    String name;
    int age;
    private double englishMarks;

    public Students(){

    }

    public void setEnglishMarks(double englishMarks){
        this.englishMarks=englishMarks;
     }

     public double getEnglishMarks(){
        return this.englishMarks;

     }

     public Students(String name,int age,double englishMarks){
        this.name=name;
        this.age=age;
        this.englishMarks=englishMarks;
     }

}


public class practice {

    public static void main(String [] args){

        Students details = new Students();

        details.name="maddy";
        details.age=22;

        details.setEnglishMarks(70);


        System.out.println(details.name);
        System.out.println(details.age);
        System.out.println(details.getEnglishMarks());


        Students report = new Students("sudharsan",18,67);


        System.out.println(report.name);
        System.out.println(report.age);
        System.out.println(report.getEnglishMarks());

    }

}
