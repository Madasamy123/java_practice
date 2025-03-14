package AssessmentQues;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class prac1 {

    public static void main(String[] args) {
        List<String>fruits=new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));

        Set<String>duplicates=new TreeSet<>(fruits);



        Map<String, Integer>FruitsCount=new TreeMap<>();

        for(String items:fruits){
            FruitsCount.put(items,FruitsCount.getOrDefault(items,0)+1);
        }


        System.out.println("unique Elements: "+duplicates);
        System.out.println("Fruits Count: "+FruitsCount);

    }

}
