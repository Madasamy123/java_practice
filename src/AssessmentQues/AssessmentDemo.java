package AssessmentQues;

import java.util.*;


/**
 * Create a list of Sorted Employee names.
 * Can't add the same employee again in the department
 *
 *
 */

public class AssessmentDemo {

    static  String departwiseSortedPrinting(List<String> departmentNameList) {
        //Write your code Here
        // HINT: Use Map<String, TreeSet<String>>
        // No need of validatio
        TreeMap<String,TreeSet<String>> map=new TreeMap<>();

        for (String str:departmentNameList){
            String[] parts=str.split(",");
            String dept=parts[0];
            String emp=parts[1];

            map.putIfAbsent(dept,new TreeSet<>());
            map.get(dept).add(emp);
        }

        StringBuilder res=new StringBuilder();
        for(String dept:map.keySet()){
            res.append(dept).append(":").append(map.get(dept)).append("\n");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        // Dont change the code below
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        sc.nextLine();
        List<String> inputLines = new ArrayList<String>(numOfLines);

        for(int i = 0; i < numOfLines; i++) {
            inputLines.add(sc.nextLine());
        }

        sc.close();
        System.out.println(departwiseSortedPrinting(inputLines));
    }
}
