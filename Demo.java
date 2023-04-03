class Demo{       // CG
	public static void main(String[] ebc){
		GGG ggg = new GGG();
		ggg.ggg();
		System.out.println("Prachtig");
	}
}

class GGG {
	void ggg() {
		System.out.println("GGG");
	}
}

class UUU extends GGG {
	void ggg() {
		throw new RuntimeException();
	}
}
