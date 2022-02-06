package constructor;

public class Hello {
    String name;

    Hello(){
        this.name = "Beginnersbook.com";
    }

    public static void main(String[] args) {
        Hello obj1 = new Hello();
        System.out.println(obj1.name);
    }
}
