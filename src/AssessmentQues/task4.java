package AssessmentQues;
import java.util.*;

public class task4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your number of details: ");

        int num=input.nextInt();
        input.nextLine();

        Set<String>details=new HashSet<>();

        System.out.println("Enter your data's:");

        for(int i=0;i<num;i++){
            details.add(input.nextLine());

        }

        List<String>customerDet=new ArrayList<>();

//        for(int j=0;j<details.size();j++){
//            String [] arr=details
//
//        }








    }
}
