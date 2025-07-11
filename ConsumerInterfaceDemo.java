import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// class ConsumerImplementation implements Consumer<Integer> {
//     public void accept(Integer i) {
//         System.out.println(i+" Stars");
//     }
// }

public class ConsumerInterfaceDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,6);

        // Consumer<Integer> c = new ConsumerImplementation();
        

        // Consumer<Integer> c = new Consumer<Integer>() {
        //     public void accept(Integer i){
        //         System.out.println(i +" Stars");
        //     }
        // };


        // Consumer<Integer> c = (Integer i) -> System.out.println(i+" Stars");
        
        list.forEach(i -> System.out.println(i+" Stars"));  // Consumer Interface is used here
        

        // list.forEach(c);
    }
}
