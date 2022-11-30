package Soru4;

public class DaireHesaplama {
	private double radius;

	public static double DaireAlanHesaplama(double radius) {
		double alan=Math.PI*radius*radius;
		return alan;
	}
	public static double DaireCevreHesaplama(double radius) {
		double cevre=2*(Math.PI)*radius;
		return cevre;
	}

}
