package Soru3;

public class Maymun extends MemeliHayvan {

	

	public Maymun(String ad, int kilo, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilo, uzunlugu, tehlikeliMi);
		
	}

	@Override
	public void yuru() {
		System.out.println(ad + " isimli maymun y�r�yor..");
		
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		
	}

}
