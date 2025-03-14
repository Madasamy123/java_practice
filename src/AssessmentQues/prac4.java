package AssessmentQues;
import java.util.Scanner;
import java.util.*;


class EmployeeDetails{
    int id;
    String name;
    String department;
    int age;
    double salary;


    public EmployeeDetails(int id, String name,String department,int age,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.age=age;
        this.salary=salary;

    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}




public class prac4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number of data's: ");

        int num=input.nextInt();
        input.nextLine();

        List<String>list1=new ArrayList<>();

        System.out.println("Enter your data's: ");

        for(int i=0;i<num;i++){
            list1.add(input.nextLine());
        }



        List<EmployeeDetails>empDetails=new ArrayList<>();

        for(int j=0;j<list1.size();j++){
            String[] arr=list1.get(j).split(",");
          int id=Integer.parseInt(arr[0]);
          String name=arr[1];
          int age=Integer.parseInt(arr[2]);
          String department=arr[3];
          Double salary=Double.parseDouble(arr[4]);

          empDetails.add(new EmployeeDetails(id,name,department,age,salary));




        }

        System.out.println("Enter type for sort: ");

        String sortType=input.nextLine();

        input.close();

        if(sortType.equals("id")){
            Collections.sort(empDetails,(a,b)-> Integer.compare(a.id,b.id));
        }
//        else if(sortType.equals("name")) {
//            Collections.sort(empDetails, (a, b) -> a.name.compareTo(b.name));
//        }
        else if(sortType.equals("age")){
            Collections.sort(empDetails,(a,b)-> Integer.compare(a.age,b.age));
        }
//        else if(sortType.equals("department")){
//            Collections.sort(empDetails,(a,b)-> a.department.compareTo(b.department));
//        }
        else{
            Collections.sort(empDetails,(a,b)-> Double.compare(a.salary,b.salary));
        }





        System.out.println(empDetails);






    }
}
