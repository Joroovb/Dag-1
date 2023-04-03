class Demo{       // BB
	public static void main(String[] ebc){
	    System.out.println("maandag");
		Fiets f = new Fiets();
		f.mmh = 3;
		Fiets f2 = new Fiets();
		System.out.println(f2.mmh);
		System.out.println(f2.hmm);
	}
}

class Fiets {
    int hmm;
    static int mmh;

    Fiets() {
        System.out.println("vrijdag");
    }
}
