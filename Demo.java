class Demo{       // CE
	public static void main(String[] ebc){
	  	System.out.println("D");
		Hoi h = new Hoi();
		try {
			h.go();
			System.out.println("W");
		} catch (Exception e) {
			System.out.println("M");
		} finally {
			System.out.println("U");
		}
		System.out.println("A");

	}
}

class Hoi {
	boolean eum;
	void go() throws Exception {
		if (eum) {
			throw new Error();
		} else {
			throw new Exception();
		}
	}
}
