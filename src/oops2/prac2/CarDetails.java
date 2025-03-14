package oops2.prac2;

import oops2.prac2.customerDetails;

public class CarDetails extends customerDetails {

     public String carName;
    public double mileage;
    public int price;
    public CarDetails(){

    }


    public CarDetails(String customerName,int cusAge,long phoneNum,String Address,String carName,double mileage,int price){

        super(customerName,cusAge,phoneNum,Address);
        this.carName=carName;
        this.mileage = mileage;
        this.price = price;
    }

public void printDetails(){
        super.printDetails();
    System.out.println("Car Name: "+this.carName);
    System.out.println("Car Milage: "+this.mileage);
    System.out.println("Car Price: "+this.price);

}



}
