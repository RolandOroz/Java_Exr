package abstractExmpl;

public class Dog extends Animal {
//A class derived from the abstract base class must
// implement those methods that are not implemented
// (means they are abstract) in the abstract class.
    public void animalSound() {
        System.out.println("Woof");
    }

    public static void main(String args[]) {
        Animal obj1 = new Dog();
        obj1.animalSound();
    }
}
