package main.Articolo.SpecialArt;

import java.util.Date;

import main.Articolo.Articolo;
import main.Articolo.InfoArt.Autore;
import main.Articolo.InfoArt.Tags;

public class ArticoloFantasy extends Articolo{

	private String descrizione;
	
	/*Costruttore che richiama dalla sua superclasse il costruttore specifico senza categoria
	 * */
	public ArticoloFantasy(String titolo, Date data, String testo, Autore autore, Tags tags) {
		super(titolo, data, testo, autore, tags);
		
		/*La proprieta' di descrizione e categoria vengono compilate con i stessi valori
		 * */
		this.descrizione=("Una categoria di generi descritta come Fantasy."
		+"\n"+"Dove la magia ha luogo di esistere e cio' che piu' sembra impossibile diventa realta'");
		this.setCategoria("Fantasy");
	}

	public String getDescrizione() {
		return descrizione;
	}
	@Override
	/*Metodo utilizzato per la conversione in stringa dell'intero articolo e le sue proprietá has-a
	 * */
	public String toString() {
		String artToString="";
		
		artToString=
		"\n"+this.getTitolo()
		+"\n"+this.getTesto()
		+"\n"+"Autore "+this.getAutore().getNome()+" "+this.getAutore().getCognome()
		+"\n"+" "+"Data:"+this.getData()+
		"\n"+"Categoria:"+this.getCategoria()+" "
		+"\n"+this.descrizione
		+"\n"+"Tags:"+this.getTags().toString()
		+"\n";
		
		return artToString;
	}

}
