package homework;
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {


        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

    ArrayList<String>uniqueCity=new ArrayList<String>();

    for(String city:cityList){
        if(!uniqueCity.contains(city)){
            uniqueCity.add(city);
        }
    }

        System.out.println("uniqueCity: "+uniqueCity);



// Add logic to remove the duplicate Array and
// store the unique city name is an another ArrayList
    }
}