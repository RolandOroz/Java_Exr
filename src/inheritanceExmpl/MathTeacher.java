package inheritanceExmpl;

public class MathTeacher extends Teacher {
  String mainSubject = "Maths";

  public static void main(String[] args) {
    MathTeacher obj1 = new MathTeacher();
    System.out.println(obj1.college);
    System.out.println(obj1.designation);
    System.out.println(obj1.mainSubject);
    obj1.does();
  }
}
