package multipleStaticBlocks;

class multipleStaticBlocks {
    static int num;
    static String mystr;

    //first static block
    static {
        System.out.println("Static block one 1");
        num = 68;
        mystr = "Block 1";
    }

    //Second static block
    static {
        System.out.println("Static block two 2");
        num = 98;
        mystr = "Block 2";
    }

    public static void main(String[] args) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of mystr: " + mystr);
    }
}
