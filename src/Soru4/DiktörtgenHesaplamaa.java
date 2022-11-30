package Soru4;

public class DiktörtgenHesaplamaa {
	private int kisaKenar;
	private int uzunKenar;
	
	public static double dikdörtgenAlanHesaplama(double kisaKenar,double uzunKenar) {
		double alan=kisaKenar*uzunKenar;
		return alan;
	}
	public static double dikdörtgenCevreHesaplama(double kisaKenar,double uzunKenar) {
		double cevre=(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
		return cevre;
	}

}
