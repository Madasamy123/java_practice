package AssessmentQues;
import java.util.Scanner;
import java.util.*;

public class prac3 {


    static void printNamesCount(List<String>list1,List<String>list2){

        if(list1==null || list2==null){
            throw new IllegalArgumentException("Invalid ArgmentException");
        }

        if(list2.size()> list1.size()){
            throw new IllegalArgumentException("Ivalid ArgumentException");
        }

        if(duplicates(list2)){
            throw new IllegalArgumentException("Invalid Argument Exception");
        }



        Map<String,Integer>countItems=new TreeMap<>();
        for(String items:list2){
            if(list1.contains(items)){
                countItems.put(items,countItems.getOrDefault(items,0)+1);
            }

        }

        StringBuilder result=new StringBuilder();

        for(String ans:countItems.keySet()){
            result.append(ans).append(": ").append(countItems.get(ans)).append("\n");
        }

        System.out.println(result);


    }

    static boolean duplicates(List<String>list2){

        boolean isCheck=false;

        for(int i=0;i<list2.size()-1;i++){
            if(list2.get(i).equals(list2.get(i+1))){
               return false;
            }
        }

         return isCheck;
    }






    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your namelist Number and Names: ");
        int num1=input.nextInt();
        input.nextLine();

        List<String>list1=new ArrayList<>(num1);

        for(int i=0;i<num1;i++){
            list1.add(input.nextLine());
        }

        System.out.println("Enter your second namelist Number and Names: ");

        int num2=input.nextInt();
        input.nextLine();

        List<String>list2=new ArrayList<>(num2);
        for(int i=0;i<num2;i++){
            list2.add(input.nextLine());
        }

//        System.out.println(list1);
//        System.out.println(list2);

        printNamesCount(list1,list2);

    }
}
