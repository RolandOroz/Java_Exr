package privateConstructor;

public class SingletoneClass {
    //Static class reference
    private static SingletoneClass obj = null;

    private SingletoneClass() {
        /*Private Constructor will prevent
         * the instantiation of this class directly*/

    }

    public static SingletoneClass objectCreationMethod() {
        /*This logic will ensure that no more than
         * one object can be created at a time */
        if (obj == null) {
            obj = new SingletoneClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class example");
    }

    public static void main(String[] args) {
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        SingletoneClass myobject = SingletoneClass.objectCreationMethod();
        myobject.display();
    }
}
