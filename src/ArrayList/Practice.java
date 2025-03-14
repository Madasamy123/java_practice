package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<String>Names=new ArrayList<>();
        Names.add("maddy");
        Names.add("sudah");
        Names.add("vajesh");
        Names.add("karthick");
        Names.add("sridhar");

      for(String items:Names){
          System.out.println(items);
      }
    }

}