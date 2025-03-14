package AssessmentQues;
import java.security.Key;
import java.util.Scanner;
import java.util.*;

public class prac2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        input.nextLine();

        List<String>fruits=new ArrayList<>(num);
        for(int i=0;i<num;i++){

            fruits.add(input.nextLine());

        }


        Map<Integer,Set<String>>groupedlist=new TreeMap<>();

        for(String items:fruits){
         int length=items.length();
         groupedlist.computeIfAbsent(length,Key->new TreeSet<>()).add(items);
        }

        for(Map.Entry<Integer,Set<String>>entry:groupedlist.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


    }
}
