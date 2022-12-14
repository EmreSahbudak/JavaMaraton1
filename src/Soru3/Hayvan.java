package Soru3;

public abstract class Hayvan extends HayvanatBahcesi {
	public String ad;
	public int kilo;
	public int uzunlugu;
	public boolean tehlikeliMi;
	
	public Hayvan(String ad, int kilo, int uzunlugu, boolean tehlikeliMi) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunlugu = uzunlugu;
		this.tehlikeliMi = tehlikeliMi;
	}
	
	public abstract void sesCikar();

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi + "]";
	}
	
	
		
	
	
	

}
