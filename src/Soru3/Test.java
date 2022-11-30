package Soru3;

public class Test {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("Simba", 100, 120, true);
		Yilan yilan=new Yilan("Terminator", 40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("�iko", 45, 50, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35, false));
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("-------hayvan ses ��kars�n");
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*"); 
		System.out.println("---------hayvan�n bilgilerini yazd�r");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Tiger");
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("-------hayvan� hareket ettir");
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("�iko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("----------hayvan�n cinsini bul");
		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("�iko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("Tomy");
	}

}
