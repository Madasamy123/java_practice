package Set_practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListSet {
    public static void main(String[] args) {

        LinkedHashSet<String> Names=new LinkedHashSet<>();
        Names.add("maddy");
        Names.add("bala");
        Names.add("hari");
        Names.add("vanu");
        Names.add("anand");

        Iterator<String>Details=Names.iterator();
//      while(Details.hasNext()){
//          System.out.println("names0: "+Details.next());
//      }

        while (Details.hasNext()) {
            String proof=Details.next();
            if (proof.equals("bala")) {
                Details.remove();
            }
        }
        System.out.println("Names :"+Names);
    }
}
