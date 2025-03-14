package oops2.prac2;

class customerDetails{
    public String customerName;
    public int cusAge;
    private long phoneNum;
    private String Address;

    public void setPhoneNum(long phoneNum){
        this.phoneNum=phoneNum;
    }
    public long getPhoneNum(){
        return this.phoneNum;
    }

    public void setAddress(String Address){
        this.Address=Address;
    }

    public String getAddress(){
        return this.Address;
    }

    public customerDetails(){

    }

    public customerDetails(String customerName,int cusAge,long phoneNum,String Address){
        this.customerName=customerName;
        this.Address=Address;
        this.cusAge=cusAge;
        this.phoneNum=phoneNum;
    }

//    public void printDetails(){
//        System.out.println("Customer Name: "+this.customerName);
//        System.out.println("Customer Age: "+this.cusAge);
//        System.out.println("Customer Address: "+this.getAddress());
//        System.out.println("Customer PhoneNumber: "+this.getPhoneNum());
//    }

        public void printDetails(){
        System.out.println("Customer Name: "+this.customerName);
        System.out.println("Customer Age: "+this.cusAge);
        System.out.println("Customer PhoneNumber: "+this.phoneNum);
        System.out.println("Customer Address: "+this.Address);

    }


}

public class Showroom {
    public static void main(String[] args) {

        customerDetails details=new customerDetails("madasamy",22,93857886767l,"pirancheri");
        details.printDetails();


        customerDetails detailSecond=new CarDetails("sudharsan",20,345654678l,"Tirunelveli","Audi",20.5,569078);
        detailSecond.printDetails();

//        customerDetails details=new customerDetails();
//        details.cusAge=22;
//        details.customerName="madasamy";
//
//        details.setAddress("thenkasi");
//        details.setPhoneNum(98765434567l);
//
//        details.printDetails();




    }

}
