package staticPolymorphism;

public class DisplayOverloading {

  //Method Overloading: This allows us to have more than one method
  // with same name in a class that differs in signature.
  public void disp(char c) {
    System.out.println(c);
  }
  public void disp(char c, int num) {
    System.out.println(c + " " + num);

    /* When I say method signature I am not talking about return
       type of the method, for example if two methods have same name,
       same parameters and have different return type, then this is
       not a valid method overloading example.

       !!!!! This will throw compilation error.  !!!!!!
     */
  }
}

