class Demo{       // CY
	public static void main(String[] ebc) throws Exception {
		Koe koe = new Tuin();
		System.out.println(koe);
		koe.rennen();	
	}
}

class Koe {
	public String toString() {
		return "moeee";
	}

	public void rennen() {
		System.out.println("oei");
	}
}

class Tuin extends Koe {
	public void rennen() throws Error {
		throw new RuntimeException();
	}
} 

