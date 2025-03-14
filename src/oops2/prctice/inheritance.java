package oops2.prctice;

class vechile{
    public void start(){
        System.out.println("The oops2.prctice.vechile is Starting...");
    }

    public void stop(){
        System.out.println("Th oops2.prctice.vechile is Stopping...");
    }
}

class motor extends vechile{
    public void honk(){
        System.out.println("The oops2.prctice.vechile is honking....");
    }
}


public class inheritance {

    public static void main(String [] args)
    {
        motor car=new motor();
        car.start();
        car.stop();
        car.honk();
    }

}
