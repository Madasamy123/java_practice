package Problem_Solving;
import java.util.*;
public class Panagram {
    public static void main(String[] args) {

        String str="Abcdefghijklmnopqrstuvwxyz";
        String check="abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(check.toCharArray()));
        str=str.toLowerCase();


        boolean isPanagram=true;


    for(char ch:check.toCharArray()){
        if(!str.contains(String.valueOf(ch))){
            isPanagram=false;
            break;
        }
    }
    if(isPanagram){
        System.out.println("it is a panagram.");
    }
    else{
        System.out.println("No, it is not  a panagram.");
    }




    }
}
