package constructorExmpl;

//There are three types of constructors:
// Default, No-arg constructor and Parameterized.
public class ConstructorExample {

  int age;
  String name;

  //default constructor
  ConstructorExample(){
    this.name = "Coco <-- is default constructor";
    this.age = 22;
  }

  ConstructorExample(String n, int a){
    this.name = n;
    this.age = a;
  }

  public static void main(String[] args) {
    ConstructorExample obj1 = new ConstructorExample();
    ConstructorExample obj2 = new ConstructorExample("Bobo", 33);

    System.out.println(obj1.name + " " + obj1.age);
    System.out.println(obj2.name + " " + obj2.age);
  }
}
