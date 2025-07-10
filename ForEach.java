import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
        number.forEach(i -> System.out.println(i));

        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Srinithya");
        names.put(2,"Divya");
        names.put(3,"Gayathri");
        names.put(4,"Thiyagarajan");

        names.forEach((key,value) -> System.out.println(key +" "+value));
       



    }
}
