package Soru4;

public class Dikt�rtgenHesaplamaa {
	private int kisaKenar;
	private int uzunKenar;
	
	public static double dikd�rtgenAlanHesaplama(double kisaKenar,double uzunKenar) {
		double alan=kisaKenar*uzunKenar;
		return alan;
	}
	public static double dikd�rtgenCevreHesaplama(double kisaKenar,double uzunKenar) {
		double cevre=(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
		return cevre;
	}

}
