class Demo{       // CB
	public static void main(String[] ebc){
	  	System.out.println("D");
		Hoi h = new Hoi();
		try {
			h.go();
		} catch (Exception e) {
			System.out.println("M");
		}
		System.out.println("A");

	}
}

class Hoi {
	void go() {
		throw new Error();
	}
}
