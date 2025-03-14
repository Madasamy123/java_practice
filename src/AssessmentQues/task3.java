package AssessmentQues;

import java.util.*;
import java.util.Scanner;


class Employee{
    String name;
    Integer age;
    double salary;


    public Employee(String name,Integer age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }


    //  toString---> convert an object into a string


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}





public class task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=input.nextInt();
        input.nextLine();

        List<String>list=new ArrayList<>();


        System.out.println("Enter your name,age,salary:");
        for(int i=0;i<num;i++){
            list.add(input.nextLine());
        }

        List<Employee>emp=new ArrayList<>();

        for(int j=0;j<list.size();j++){
            String[]arr=list.get(j).split(",");

            String name=arr[0];
            Integer age=Integer.parseInt(arr[1]);
            Double salary=Double.parseDouble(arr[2]);

            emp.add(new Employee(name,age,salary));
        }

        System.out.println("Employee: "+ emp);


        System.out.println("Enter your sorting: Enter name or age or salary ");

        String sortingType=input.nextLine();


        input.close();

        if(sortingType.equals("name")){

            //  collection.sort()--->  static method for sorting
            //  comparator ---> An interface used Custom sorting logic  // custom objects
            //  comparing---->  comparator static method  // object la ull property based7 sorting ku use panrom
            // lambda expression take input to sorting logic

            Collections.sort(emp,Comparator.comparing(e->e.name));

        }
        else if(sortingType.equals("age")){

            Collections.sort(emp,Comparator.comparing(e->e.age));

        }
        else{

            Collections.sort(emp,Comparator.comparing(e->e.salary));

        }

        for(Employee result:emp){
            System.out.println(result);
        }



    }
}
