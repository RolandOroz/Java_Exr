package dynamicPolymorphism;

public class Dog extends Animal{
  public void animalSound(){
    System.out.println("Woof");
  }

  public static void main(String[] args) {

    Animal obj2 = new Animal();
    obj2.animalSound();
// This would call the Animal class method

    Dog obj3 = new Dog();
    obj3.animalSound();
// This would call the Dog class method

    Animal obj4 = new Dog();
    obj4.animalSound();
// This would call the Dog class method
  }
}

/*

IS-A & HAS-A Relationships

A Car IS-A Vehicle and HAS-A License then the code would look like this:

public class Vehicle{ }
public class Car extends Vehicle{
   private License myCarLicense;
}

*/