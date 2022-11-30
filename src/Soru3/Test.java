package Soru3;

public class Test {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("Simba", 100, 120, true);
		Yilan yilan=new Yilan("terminator", 40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("cobra", 35, 200, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35, false));
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Tiger");
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");

		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
	}

}
