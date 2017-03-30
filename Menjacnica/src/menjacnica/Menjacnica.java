package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valute;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valute> valute=new LinkedList<Valute>();

	@Override
	public void dodajKurs(String naziv, String skraceno, GregorianCalendar datum, double prodajni, double kupovni,
			double srednji) {
		Valute v=new Valute();
		v.setNazivValute(naziv);
		v.setSkraceniNaziv(skraceno);
		v.setDatum(datum);
		v.setKupovniKurs(kupovni);
		v.setProdajniKurs(prodajni);
		v.setSrednjiKurs(srednji);
		
		if(!(valute.contains(v))){
			valute.addLast(v);
			}

	}

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
