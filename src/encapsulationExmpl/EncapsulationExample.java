package encapsulationExmpl;

public class EncapsulationExample {
  public static void main(String[] args) {
    EmployeeCount obj1 = new EmployeeCount();
    obj1.setNumOfEmployees(100);
    System.out.println("No of Employees: " + (int)obj1.getNumOfEmployees());
  }
}
