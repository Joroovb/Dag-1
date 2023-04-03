class Demo{       // BI
	public static void main(String[] ebc){
	   Maker m = new Maker();
	   (Fiets) m.gaan().voortgaan();
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
