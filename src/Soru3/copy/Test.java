package Soru3.copy;

public class Test {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("Simba", 100, 120, true);
		Yilan yilan=new Yilan("terminator", 40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("ciko", 45, 50, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("cobra", 35, 200, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("kermit", 2, 35, false));
		System.out.println("gfdgdfg");
		
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);

	}

}
