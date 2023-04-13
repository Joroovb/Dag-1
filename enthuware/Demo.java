public class Demo{   // QL
	public static void main(String[] args){
        Kleding jas = new Jas();
        jas.knopen();
        System.out.println(jas.knoop);
        jas.knopen(5);
	}
}
class Jas extends Kleding {
    int knoop = 55;
    int prijs = 88;
	int knopen() {
		System.out.println("in knopen" + knoop);
		super.prijs = 288;
		return 17;
	}
}
class Kleding {
    int prijs;
    int knoop = 70;
    int knopen(int a) {
        System.out.println("In knopen kleding" + knoop);
        return 18;
    }
}
