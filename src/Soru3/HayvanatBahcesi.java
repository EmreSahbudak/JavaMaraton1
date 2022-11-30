package Soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi implements IHayvanatBahcesi{
	
	
	List<Hayvan> hayvanlar=new ArrayList<>();
	List<MemeliHayvan> memeliHayvanlar=new ArrayList<>();
	List<Surungen> surungenHayvanlar=new ArrayList<>();
	
	
	@Override
	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		hayvanlar.add(memeliHayvan);
		System.out.println(memeliHayvan+"eklendl");
	}
	@Override
	public void bahceyeSurungenEkle(Surungen surungen) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		
	}
	@Override
	public void hayvaninCinsiniBul(String hayvanAdi) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		
		if (hayvanlar.contains(hayvanAdi)) {
			System.out.println("ad "+ hayvanAdi);
		}else {
			System.out.println(hayvanAdi+" isimli hayvan bulunamamýþtýr");
		}
		
		
		
	}
	@Override
	public void hayvaniHareketEttir(String hayvanAdi) {
		
		  
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		
	}
		
	
	public void bahceyeSurungenEkle(Surungen surungen) {
		
	}
	
	
	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
	}
		
	
	public void hayvaninCinsiniBul(String hayvanAdi) {
		
	}
		
	
	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		
	}
	

	public void hayvaniHareketEttir(String hayvanAdi) {
		
	}*/
		
	
	
	

}
