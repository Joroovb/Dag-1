class Demo{       // AN
	public static void main(String[] ebc){
	    System.out.println("Let's go!");
		hoezo().hoi();
	}

	static Boven hoezo() {
	   return new Onder();
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
