class Demo{       // AK
	public static void main(String[] ebc){
	    System.out.println("Let's go!");
		Onder b = new Onder();
		b.hoi();
	}
}

class Boven {
    void hoi() {
        System.out.println("Ik ben boven");
    }
}

class Onder extends Boven {
    void hoi(int a) {
        System.out.println("ik ben beneden");
    }
}
