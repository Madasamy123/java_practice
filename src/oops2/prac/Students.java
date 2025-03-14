package oops2.prac;


import oops2.prac.StudentDetails;

public class Students {

    public static void main(String [] args){

        //  creating objects (Instances)

        StudentDetails first=new StudentDetails("madasamy",22,"pysics");
        first.printDetails();

        collegeStudents second=new collegeStudents("sudharsan",22,"electrical engg",32,45);
        second.printDetails();

        fssaAcademy third=new fssaAcademy("vajesh",20,"csc",66,66,"java","driveluxe",87);
        third.printDetails();

    }





}
