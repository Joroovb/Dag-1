class Demo{       // AI
	public static void main(String[] ebc){
	    System.out.println("Let's go!");
		Boven b = new Onder();
		b.hoi();
	}
}

class Boven {
    void hoi() {
        System.out.println("Ik ben boven");
    }
}

class Onder extends Boven {
    void hoi() {
        System.out.println("ik ben beneden");
    }
}
