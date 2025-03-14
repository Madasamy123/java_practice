// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package method_passing;

class PersonsList{
    int id;
    String name;

    //  constructor

    public PersonsList(int id,String name){

        this.id=id;
        this.name=name;

    }

    //  method to print details

    public void prints(){
        System.out.println("id: "+id);
        System.out.print("name: "+name);
    }


}

class Prac1 {
    public static void main(String[] args) {

        PersonsList details=new PersonsList(1,"madasamy");



        details.prints();


    }
}


//package method_passing;
//
//class PersonsList{
//    int id;
//    String name;
//
//
//
//    //  method to print details
//
//    public void prints(){
//        System.out.println("id: "+id);
//        System.out.print("name: "+name);
//    }
//
//
//}
//
//class Prac1 {
//    public static void main(String[] args) {
//
//        PersonsList details=new PersonsList();
//        details.id=1;
//        details.name="deepak";
//
//        details.prints();
//
//
//    }
//}