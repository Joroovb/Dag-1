class Demo{       // CI
	public static void main(String[] ebc){
		GGG ggg = new UUU();
		try {
			ggg.ggg();
		} catch (RuntimeException e) {
			System.out.println("iets");
		} catch (AB a) {
			System.out.println("beter");
		} finally {
			System.out.println("niets");
		}
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
		throw new AB();
	}
}

class AB extends Error{}
