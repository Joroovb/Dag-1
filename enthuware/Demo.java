public class Demo {
    public static void main(String[] args) {
        ints(1);
    }

    static void ints(int a) {
        System.out.println("int");
    }

    static void ints(Integer a) {
        System.out.println("Integer");
    }

    static void ints(double a) {
        System.out.println("double");
    }

}
