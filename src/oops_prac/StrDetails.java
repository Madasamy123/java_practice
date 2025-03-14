package oops_prac;

class Account{
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
    public Account(){

    }


    // constructor

    public Account(String Accno, String name,double balance){

       this.Accno=Accno;
       this.name=name;
       this.balance=balance;

    }





}

public class StrDetails {

    public static void main(String [] args){
        Account demoStr=new Account();
        demoStr.setAccno("A123");
        demoStr.setName("madasamy");
        demoStr.setBalance(10000);

        System.out.print(demoStr);
    }

}
