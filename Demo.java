class Demo{       // CC
	public static void main(String[] ebc){
	  	System.out.println("D");
		Hoi h = new Hoi();
		try {
			h.go();
			System.out.println("W");
		} catch (Throwable e) {
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
