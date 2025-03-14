




public class Objclass {

    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String []args)
    {
        Objclass lap1 = new Objclass();
        lap1.name="micro";
        lap1.proc="i2";
        lap1.ram=6;
        lap1.price=80000;

        Objclass lap2 = new Objclass();
        lap2.name="apple";
        lap2.proc="i4";
        lap2.ram=8;
        lap2.price=120000;

        System.out.println(lap1.name);
        System.out.print(lap2.name);



    }
}


