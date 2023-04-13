public class Demo{   // QE
	public static void main(String[] args){
		System.out.println("Hij doet het");
        Jas jas = new Jas();
	}
}
class Jas{
    int knoop = knopen();
	int knopen(){
		System.out.println("in knopen");
		return 17;
	}
	Jas(){
		System.out.println("in Jas");
	}
}
class Kleding {
    int prijs;
    Kleding (int getal) {
        System.out.println("In kleding");
        prijs = getal;
    }
}
