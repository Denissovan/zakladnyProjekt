package postavy;

public abstract class UcastniciKurzu {

	public String meno;
	public String priezvisko;
	public String PrihlasMeno;
	public String PrihlasHeslo;

	public UcastniciKurzu(String meno, String priezvisko, String PrihlasMeno, String PrihlasHeslo) {
		
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.PrihlasMeno = PrihlasMeno;
		this.PrihlasHeslo = PrihlasHeslo;
		
		
	}
		
	
	
	public void display(UcastniciKurzu o) {
		System.out.println(o.meno);
		System.out.println(o.priezvisko);
		System.out.println(o.PrihlasMeno);
		System.out.println(o.PrihlasHeslo);
		System.out.println();

	}






}
