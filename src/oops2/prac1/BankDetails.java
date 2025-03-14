package oops2.prac1;

import oops2.prac1.FullDetails;

public class BankDetails extends FullDetails {
    private long adhaarNumber;

    public void setAdhaarNumber(long adhaarNumber){
        this.adhaarNumber=adhaarNumber;

    }

    public BankDetails(){

    }

    public BankDetails(String name, String Address, int YearIncome,int age, String gender,long adhaarNumber){
        super(name,Address,YearIncome,age,gender);
        this.adhaarNumber=adhaarNumber;


    }
    public void printDet(){
        super.printDet();
        System.out.println("adhaarNumber: "+adhaarNumber);


    }


}
