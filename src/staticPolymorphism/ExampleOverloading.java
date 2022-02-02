package staticPolymorphism;

public class ExampleOverloading {

  public static void main(String[] args) {
    DisplayOverloading obj1 = new DisplayOverloading();

    obj1.disp('A');
    obj1.disp('B', 15);
  }
}
