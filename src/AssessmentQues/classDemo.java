package AssessmentQues;
import java.util.*;
import java.util.Scanner;

public class classDemo {

    static void countNamesPrint(List<String> List1,List<String> List2){


        // List1 or List2 is  null validate


       if(List1==null || List2==null){
           throw new IllegalArgumentException("Invalid ArgumentException");
       }

       //  List2 is greater than List1

       if(List1.size()<List2.size()){
           throw new IllegalArgumentException("Invalid ArgumentException");
       }
//  duplicate
       if(duplicate(List2)){
           throw new IllegalArgumentException("Invalid ArgumentException");

       }

       // list 2 element not found

        for(String s: List2){
            if(!List1.contains(s)){
                throw new IllegalArgumentException("List2 element is not found in LIst1");
            }

        }



        TreeMap<String,Integer>count=new TreeMap<>();


        for(String item : List1) {
                if(count.containsKey(item)) {
                    count.put(item, count.get(item) + 1);
                } else {
                    count.put(item, 1);
                }
        }


        StringBuilder result=new StringBuilder();

       for(String ans:List2){
           if(count.containsKey(ans)){
               result.append(ans).append(": ").append(count.get(ans)).append("\n");
           }

       }



        System.out.println(result);


    }

    //  duplicate validate

    static boolean duplicate(List<String> List2){
        boolean isCheck=false;

        for(int i=0;i<List2.size()-1;i++){
            if(List2.get(i).equals(List2.get(i+1))){
                return false;
            }
        }
        return isCheck;

    }



    public static void main(String[] args) {

   Scanner input=new Scanner(System.in);


   System.out.print("Enter your list1 Number and list: ");
   int num1=input.nextInt();
   input.nextLine();
   List<String>List1=new ArrayList<>(num1);

   for(int i=0;i<num1;i++){
       List1.add(input.nextLine());
   }

   System.out.print("Enter your list2 Number and list: ");

   int num2=input.nextInt();
   input.nextLine();

   List<String>List2=new ArrayList<>(num2);


   for(int i=0;i<num2;i++){
       List2.add(input.nextLine());
   }


  input.close();   // memeory leak agama eruka


//        System.out.println(List1);
//        System.out.println(List2);


        countNamesPrint(List1,List2);


    }
}
