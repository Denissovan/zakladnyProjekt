package Interakcia;

import postavy.*;

public class Interakcia {
	


	public static void main(String[] args) {
		
		
		
		Student o = new Student("Laco", "Novotny", "NovyUzivatel", "televizor");
		Ucitel r = new Ucitel("Martin", "Carrot", "NovyUcitel", "Matematika");
		
		o.display(o);
		r.display(r);
		
		
		
	}
}
