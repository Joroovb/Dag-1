class Demo{       // BD
	public static void main(String[] ebc){
	    System.out.println("maandag");
		Fiets f = new Fiets();
		f.mmh = 3;
		Fiets f2 = new Fiets();
		System.out.println(f2.mmh);
	}
}
class Fiets {
    int hmm;
    static int mmh = jo();
    void Fiets() {
        System.out.println("vrijdag");
    }
    static int jo() {
        System.out.println("5");
        return 6;
    }
}
