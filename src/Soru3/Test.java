package Soru3;

public class Test {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("Simba", 100, 120, true);
		Yilan yilan=new Yilan("Terminator", 40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35, false));
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("-------hayvan ses çýkarsýn");
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*"); 
		System.out.println("---------hayvanýn bilgilerini yazdýr");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Tiger");
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("-------hayvaný hareket ettir");
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("----------hayvanýn cinsini bul");
		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("Tomy");
	}

}
