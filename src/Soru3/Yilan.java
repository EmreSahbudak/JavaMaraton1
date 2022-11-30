package Soru3;

public class Yilan extends Surungen {

	public Yilan(String ad, int kilo, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilo, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(ad+ " isimli yýlan sürünüyor" );
		
	}

	@Override
	public void sesCikar() {
		System.out.println( ad+ " týslýyor....");
		
	}

}
