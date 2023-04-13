public class Demo{   // QI
	public static void main(String[] args){
        Kleding jas = new Jas();
        System.out.println(jas.prijs);
        jas.knopen();
	}
}
class Jas extends Kleding {
    int knoop = 55;
    int prijs = 88;
	int knopen(){
		System.out.println("in knopen");
		return 17;
	}
}
class Kleding {
    int prijs;
    int knoop = 70;
    int knopen() {
        System.out.println("In knopen kleding");
        return 18;
    }
}
