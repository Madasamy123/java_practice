package Set_practice;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class setOnePractice {
    public static void main(String[] args) {

        Set<Integer>Numbers1=new HashSet<Integer>();


        Numbers1.addAll(Arrays.asList(new Integer []{1,2,3,4,5,6,7,8}));

        Set<Integer>Numbers2=new HashSet<Integer>();

        Numbers2.addAll(Arrays.asList(new Integer[]{5,6,7,8,9,10,11}));

        Set <Integer>Union=new HashSet<Integer>(Numbers1);

        Union.addAll(Numbers2);

        System.out.println(Union);

        //


        Set<Integer>Intersection=new HashSet<Integer>(Numbers1);
        Intersection.retainAll(Numbers2);


            System.out.println(Intersection);

            //

        Set<Integer>Difference =new HashSet<Integer>(Numbers1);
        Difference.removeAll(Numbers2);
        System.out.println(Difference);








        }


    }

    //





