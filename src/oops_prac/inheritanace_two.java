package oops_prac;

class MulNum extends AddNum{

    public MulNum(int num1,int num2){
        super(num1,num2);


    }

    public MulNum(){

    }

    void mulvalue(){
        System.out.println("mul: "+num1*num2);
    }

}
