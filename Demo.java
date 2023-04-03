class Demo{       // CA
	public static void main(String[] ebc){
	  	System.out.println("D");
		Hoi h = new Hoi();
		h.go();
		System.out.println("A");

	}
}

class Hoi {
	void go() {
		throw new Error();
	}
}
