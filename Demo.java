class Demo{       // BE
	public static void main(String[] ebc){
	   Maker m = new Maker();
	   m.gaan().voortgaan();
	   System.out.println(m.gaan().a);
	}
}
class Fiets {
    void voortgaan() {
        System.out.println("gaan in fiets");
    }
}
class Maker {
    Fiets gaan() {
        System.out.println("in gaan");
        return new Fiets();
    }
}
class Voertuig {
    int a;
}
