class Demo{       // BG
	public static void main(String[] ebc){
	   Maker m = new Maker();
	   m.gaan().voortgaan();
	   Fiets f = new Fiets();
	   System.out.println(m.gaan().a++);
	   System.out.println(m.gaan().a++);
	}
}
class Fiets extends Voertuig {
    int a;
    void voortgaan() {
        System.out.println("gaan in fiets");
    }
}
class Maker {
    Fiets defiets = new Fiets();
    Fiets gaan() {
        System.out.println("in gaan");
        return defiets;
    }
}
class Voertuig {
}
