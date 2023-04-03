class Demo{       // AI
	public static void main(String[] ebc){
	    System.out.println("Let's go!");
		Onder b = new Boven();
		// Iedere meeuw is een vogel
		// Niet iedere vogel is een meeuw
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
