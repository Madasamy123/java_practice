package oops2.prac1;


class peopleDet{
    public String Name;
    private String Address;
    private int YearIncome;


    public void setAddress(String Address){
        this.Address=Address;
    }
    public String getAddress(){
        return Address;

    }
    public void setYearIncome(int yearIncome){
        this.YearIncome=yearIncome;
    }

    public int getYearIncome(){
        return YearIncome;
    }


    public peopleDet(){

    }

    public peopleDet(String name,String Address,int YearIncome){
        this.Name=name;
        this.Address=Address;
        this.YearIncome=YearIncome;

    }

    public void printDet(){
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Income: "+YearIncome);
    }


}


public class People {
    public static void main(String [] args){

//        peopleDet p1=new peopleDet();
//        p1.Name="madasamy";
//        p1.setAddress("Pirancheri, Tirunelveli");
//        p1.setYearIncome(12000);
//
//        System.out.println("name: "+p1.Name);
//        System.out.println("address: "+p1.getAddress());
//        System.out.println("income: "+p1.getYearIncome());

        peopleDet p2=new BankDetails("Aanand","Chennai",12000,15,"male",987987696l);
        p2.printDet();

    }
}
