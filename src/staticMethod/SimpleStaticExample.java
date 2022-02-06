package staticMethod;

public class SimpleStaticExample {

    //this is a static method
    static void myMethod(){

        System.out.println("my Static Method");
    }

    public static void main(String[] args) {
        /* You can see that we are calling this
         * method without creating any object.
         */
        myMethod();
    }
}


