package encapsulationExmpl;/*ENCAPSULATION*/

public class EmployeeCount {
  // 1. Make the instance variables private
  private int numOfEmployees = 0;

  // 2. Have getter and setter methods in the class to set and get the values of the fields
  public void setNumOfEmployees(int count) {
    numOfEmployees = count;
  }
  public double getNumOfEmployees() {
    return numOfEmployees;
  }
}
//run encapsulationExmpl.EncapsulationExample.java