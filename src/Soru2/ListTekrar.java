package Soru2;

public class ListTekrar {

	public static void main(String[] args) {
		listTekrarEden();
		
	}
	private static void listTekrarEden() {
		
		int sayiDizisi[]=  {1,3,5,7,9,9,2,4,6,8,9};
		int sayac=0;
		int sayi=0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			
			sayi=sayiDizisi[i];
			
			for (int j = i+1; j < sayiDizisi.length; j++) {
				
				if (sayiDizisi[i]==sayiDizisi[j]) {
					
					sayac++;
				}
				
			}
			
		}
		if (sayac==0) {
			System.out.println("tekrar eden sayý bulunmamýþtýr");
		}else {
			System.out.println(sayi+" sayisi "+ (sayac)+ " kez tekrar ediyor");
		}
		
		
	}

}
