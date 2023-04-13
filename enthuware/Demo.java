public class Demo{   // UQ
	public static void main(String[] args) {
	    Fiets f = new Fiets();
		Fiets f2 = f;
        lopen(f);
        System.out.println("einde" + f2.a);
	}
	static void lopen(Object x) {
	   x.a = 25;
	   System.out.println("We zijn hier");
	}
}
class Fiets {
    int a = hoi();
    static int hoi() {
        System.out.println("Hoi!");
        return 7;
    }
}
