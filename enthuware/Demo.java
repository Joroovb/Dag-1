public class Demo{   // MC
	public static void main(String[] args){
        System.out.println("a");
        R b = new R();
        b.ben();
	}
}

class B {
    int b;
    void ben() throws Exception {
        System.out.println("Ben toch");
        throw new Exception();
    }
}
class R extends B {
    int b = 30;
    void ben() {
        System.out.println("plz");
    }
}
