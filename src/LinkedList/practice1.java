package LinkedList;

import java.util.LinkedList;
import java.util.List;
public class practice1 {

    public static void main(String[] args) {

        List <String>object=new LinkedList<>();
        object.add("ravi");
        object.add("ragul");
        object.add("ramesh");
        object.add("rajini");
        object.add(3,"maddy");

        String getName=object.get(2);

        System.out.println(object);
        System.out.println(getName);

    }
}
