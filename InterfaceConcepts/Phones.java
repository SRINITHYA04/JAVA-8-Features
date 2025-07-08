interface Phones {

    void call(); 

    // you can have default methods
    default void type(){
        System.out.println("Samsung Flip");
    }  

      
}

class Android implements Phones{

    public void call(){
        System.out.println("Sansung calling");
    }
    public void type(){
        System.out.println("samsung");
    }
    void color(){
        System.out.println("black");
    }
}

class InterfaceDemo{
    public static void main(String[] args) {
        Android obj = new Android();

        obj.type(); /*class has higher precedence so output:samsung */
        obj.call();
        obj.color();

    }
}