package Soru1;

public class Main {
	static int yildiz=6;

	public static void main(String[] args) {
		duzYildizOlusturma();
		yildizAzaltma();
		
	}
	private static void duzYildizOlusturma() {
		for (int i = 0; i < 4; i++) {
			System.out.println("*******");
		}
		
	}
	
	public static void yildizAzaltma() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < yildiz; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			yildiz--;
		}
	}

}
