package constructorOveloading;

public class StudentData {

    private int stuId;
    private String stuName;
    private int stuAge;
    StudentData(){

        //Default constructor
        stuId = 100;
        stuName = "New Student";
        stuAge = 18;
    }
    //parameterized constructor
    StudentData(int num1, String str, int num2){

        stuId = num1;
        stuName = str;
        stuAge = num2;
    }
//getter and setter methods
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public static void main(String[] args) {

        //This object creation would call the default constructor
        StudentData myObj1 = new StudentData();
        System.out.println("Student Name is: " + myObj1.getStuName() + " <-default");
        System.out.println("Student Age is: " + myObj1.getStuAge() + " <-default");
        System.out.println("Student Id is: " + myObj1.getStuId() + " <-default");

        //This object creation would call the parameterized constructor
        StudentData myObj2 = new StudentData(555, "Chaitanya", 25);
        System.out.println("\nStudent Name is: " + myObj2.getStuName());
        System.out.println("Student Age is: " + myObj2.getStuAge());
        System.out.println("Student Id is: " + myObj2.getStuId());
    }
}
