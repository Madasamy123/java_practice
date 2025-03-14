package oops_prac;

class Account3{
    private String Accno;
    private String name;
    private double balance;


    public String getAccno() {
        return Accno;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccno(String accno) {
        this.Accno = accno;
    }





    // default constructor
    public Account3(){

    }


    // constructor

    public Account3(String Accno, String name,double balance){

        this.Accno=Accno;
        this.name=name;
        this.balance=balance;

    }


    @Override
    public String toString() {
        return "Account [accNo=" + Accno + ", name=" + name + ", balance="  + balance + "]";
    }





}

public class ToStringDemo {

    public static void main(String [] args){
        Account3 demoStr=new Account3();
        demoStr.setAccno("A123");
        demoStr.setName("madasamy");
        demoStr.setBalance(10000);

        System.out.print(demoStr);
    }

}
