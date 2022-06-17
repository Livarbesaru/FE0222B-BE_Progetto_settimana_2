package main;
import main.Articolo.Articolo;
import main.Articolo.SpecialArt.ArticoloFantasy;
import main.Articolo.SpecialArt.ArticoloNoir;
import main.interfacce.BlogImpl;

public class Blog implements BlogImpl{
	
	private Articolo[] artsInMem;
	
	public Blog(Articolo[] art){
		this.artsInMem=art;
		this.ordinaId();
	}
	
	private void ordinaId(){
		int id=0;
		
		for(int i=0;i<this.artsInMem.length;i++) {
			this.artsInMem[i].setId(id);
			id++;
		}
	}

	@Override
	public void stampaArticoloPerId(int id) {
		Articolo artScelto=null;
		for(int i=0;i<this.getArtsInMem().length;i++) {
			if(this.getArtsInMem()[i].getId()==id) {
				System.out.println(this.getArtsInMem()[i].toString());
			}
		}
		if(artScelto==null) {
			System.out.println("L'articolo scelto non esiste");
		}
	}

	@Override
	public void stampaArticoli() {
		for(int i=0;i<this.getArtsInMem().length;i++) {
			System.out.println(this.getArtsInMem()[i].toString());
		}
		
	}
	public Articolo[] getArtsInMem() {
		return artsInMem;
	}
	
}
