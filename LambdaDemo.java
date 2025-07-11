interface Human { // funtional interface --> with 1 abstract method
        void talk(int i);
}

class Girl implements Human {
    public void talk(int i){
           System.out.println("Hello from Girl class !!!"); 
        }
    }

public class LambdaDemo {
    public static void main(String[] args) {

        // //you can create reference of interface but not instantiate, so use upcasting.
        // Human obj = new Girl(); 
        // obj.talk(6);


        // // instead of creating a whole new class for a single function talk(), 
        // // we can create anonymous Inner class 
        // Human obj = new Human() {
        //     public void talk(int i){
        //         System.out.println("Hello From Anonymous Inner class !!!");
        //     }
        // };
        // obj.talk(6);


        // Human obj = () -> System.out.println("Hello from lambda expression");  --> no argument 

        // with argument example
        // Human obj = (int i) -> System.out.println("Hello my age from lambda expression is: " + i); 
        Human obj = i -> System.out.println("Hello my age from lambda expression is : "+i);  
        obj.talk(6);
           
    }
    
}
//
// 