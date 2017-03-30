package menjacnica;

import java.util.GregorianCalendar;

import valute.Valute;

public interface MenjacnicaInterfejs {
	public void dodajKurs(String naziv, String skraceno, GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	public Valute pronadjiKurs(String naziv, GregorianCalendar datum);

}
