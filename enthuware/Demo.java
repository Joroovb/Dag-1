public class Demo{   // QJ
	public static void main(String[] args){
        Kleding jas = new Jas();
        // links bepaald waar we bij kunnen
        // recht bepaald wat we doen
        jas.knopen();
        System.out.println(jas.prijs);
	}
}
class Jas extends Kleding {
    int knoop = 55;
    int prijs = 88;
	int knopen() {
		System.out.println("in knopen");
		prijs = 288;
		return 17;
	}
}
class Kleding {
    int prijs = 18;
    int knoop = 70;
    int knopen() {
        System.out.println("In knopen kleding");
        return 18;
    }
}
