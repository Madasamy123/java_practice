package Set_practice;
import java.util.HashSet;
import java.util.Set;
public class setCreateExample {
    public static void main(String[] args) {

        Set<String>Names=new HashSet<>();
        Names.add("maddy");
        Names.add("suresh");
        Names.add("nainar");
        Names.add("maddy");

        System.out.println(Names);
    }
}
