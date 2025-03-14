package oops_prac;


class AddNum{

    int num1;
    int num2;

    public AddNum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public AddNum(){

    }

    void addvalue(){
        System.out.println("sum: "+num1+num2);
    }
}