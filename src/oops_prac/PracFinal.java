package oops_prac;

class Days{
    final int Totalweekdays=7;



    public static void displays(){
     //   TotalWeekdays=8; cannot assign the value

        System.out.println("Total weekdays is 7");
    }
}




public class PracFinal {
    public static void main(String [] args){
        Days disp=new Days();
        disp.displays();

    }

}
