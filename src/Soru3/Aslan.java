package Soru3;

public class Aslan extends MemeliHayvan {

	

	public Aslan(String ad, int kilo, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilo, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(ad+ " isimli aslan yürüyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(ad+ " kükrüyor...");
		
	}

}
