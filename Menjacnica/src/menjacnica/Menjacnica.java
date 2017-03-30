package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valute;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valute> valute=new LinkedList<Valute>();
	
	//metoda dodaje novu valutu u lisu
	@Override
	public void dodajKurs(String naziv, String skraceno, GregorianCalendar datum, double prodajni, double kupovni,
			double srednji) {
		Valute v=new Valute();
		v.setNazivValute(naziv);
		v.setSkraceniNaziv(skraceno);
		v.setDatum(datum);

		v.setProdajniKurs(prodajni);
		v.setKupovniKurs(kupovni);
		v.setSrednjiKurs(srednji);
		
		valute.add(v);
	}
	//metoda brise odredjenu valutu iz liste ciji je naziv i datum unet od strane korisnika
	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		Valute v=new Valute();
		v.setNazivValute(naziv);
		v.setDatum(datum);
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v))
				valute.remove(valute.get(i));
		}

	}
	//metoda pronalazi odredjeni element liste ciji je naziv valute isti kao uneti, za odredjeni dan.
	@Override
	public Valute pronadjiKurs(String naziv, GregorianCalendar datum) {
		Valute v=new Valute();
		v.setNazivValute(naziv);
		v.setDatum(datum);
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).equals(v))
				return valute.get(i);
		}
		return null;
	
	}

}
