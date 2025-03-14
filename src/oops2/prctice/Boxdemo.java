package oops2.prctice;

class Box{
    int length;
    int breath;
    int hight;

}


public class Boxdemo {

    public static void main(String [] args)
    {
        Box blackBox=new Box();
        blackBox.length=10;
        blackBox.breath=5;


        Box woodBox=new Box();
        woodBox.length=5;
        woodBox.hight=5;
        woodBox.breath=5;

        System.out.println((blackBox.length));
        System.out.println((woodBox.length));
    }
}
