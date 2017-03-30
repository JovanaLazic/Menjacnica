package valute;

import java.util.GregorianCalendar;

public class Valute {
	private String nazivValute;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute==null || nazivValute.isEmpty()) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null || skraceniNaziv.isEmpty()) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum.before(new GregorianCalendar())) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<=0) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<=0) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<=0) throw new RuntimeException("Uneta nedozvoljena vrednost.");
		this.srednjiKurs = srednjiKurs;
	}
	
	@Override
	public String toString() {
		return "Valuta: "+getNazivValute()+" na dan: "+getDatum()+" ima prodajni kurs: "+getProdajniKurs()+
				", kupovni kurs: "+getKupovniKurs()+" i srednji kurs: "+getSrednjiKurs();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		Valute v=(Valute)(o);
		
		if(v.getNazivValute().equals(nazivValute) && v.getDatum().equals(datum))
			return true;
		
		return false;
		
	}
	
	
	
	

}
