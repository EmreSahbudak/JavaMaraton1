package Soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
	
	
	List<Hayvan> hayvanlar=new ArrayList<>();
	

	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		
		hayvanlar.add(memeliHayvan);
		System.out.println(memeliHayvan+"eklendl");
	}
		
	
	public void bahceyeSurungenEkle(Surungen surungen) {
		hayvanlar.add(surungen);
	}
	
	
	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		//System.out.println(hayvan.sesCikar());
	}
		
	
	public void hayvaninCinsiniBul(String hayvanAdi) {
		for (Hayvan hayvan : hayvanlar) {
			if (hayvan.ad.equals(hayvanAdi)) {
				if (hayvan instanceof MemeliHayvan) {
					System.out.println(hayvan.ad+ " memelidir.");
				}else if (hayvan instanceof Surungen) {
					System.out.println(hayvan.ad + " sürüngendir");
				}
				}else {
					System.out.println(hayvan.ad+ " böyle bir hayvan yoktur");
					break;
				}
			
			
		}
		
	}
		
	
	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		for (Hayvan hayvan : hayvanlar) {
			if (hayvan.ad.equals(hayvanAdi)) {
				System.out.println(hayvan.toString());
			}else {
				System.out.println(hayvan.ad+ " böyle bir hayvan yok");
			}
		}
	}

	public void hayvaniHareketEttir(String hayvanAdi) {
		Yilan yilan=new Yilan(hayvanAdi, 444, 44440, false);
		Aslan aslan=new Aslan(hayvanAdi, 0, 0, false);
		Maymun maymun=new Maymun(hayvanAdi, 0, 0, false);
		Kertenkele kertenkele=new Kertenkele(hayvanAdi, 0, 0, false);
		kertenkele.surun();
		yilan.surun();
		aslan.yuru();
		aslan.yuru();
		
	}
		
	
		
	
	
	

}
