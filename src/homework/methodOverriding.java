package homework;

public class methodOverriding {

    String name;

    public  methodOverriding (String name){
        this.name=name;
    }

    public String print(){

        return name;
    }

    public static void main(String[] args) {
        methodOverriding ans=new methodOverriding("maddy");
        System.out.println(ans.print());
    }
}
