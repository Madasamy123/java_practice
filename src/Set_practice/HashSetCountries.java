package Set_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetCountries {
    public static void main(String[] args) {
        Set<String>CountryName=new HashSet<String>();

        CountryName.add("India");
        CountryName.add("Pakisthan");
        CountryName.add("Austrilia");
        CountryName.add("Newzealand");

        CountryName.add("Null");
        CountryName.add("Pakisthan");



       CountryName.remove("Null");



        Iterator<String>first=CountryName.iterator();

//       while (first.hasNext()){
//           System.out.println(first.next());
//       }

       while (first.hasNext()){
           String second=first.next();

           if(second.equals("Austrilia")){

               first.remove();
           }
       }



        System.out.println("answer: "+CountryName);


    }
}
