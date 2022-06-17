package main.Articolo;
import java.util.Date;

import main.Articolo.InfoArt.Autore;
import main.Articolo.InfoArt.Tags;
import main.Articolo.SpecialArt.ArticoloFantasy;
import main.Articolo.SpecialArt.ArticoloNoir;

public class Articolo {

	private int id;
	private String titolo;
	private Date data;
	private String categoria;
	private String testo;
	private Autore autore;
	private Tags tags;
	
	/*Costruttore utilizzato per la creazione di un articolo riempiendo manualmente tutti i campi
	 * */
	public Articolo(String titolo,Date data,String categoria,String testo,Autore autore,Tags tags){
		this.titolo=titolo;
		this.data=data;
		this.categoria=categoria;
		this.testo=testo;
		this.autore=autore;
		this.tags=tags;
	}
	
	/*Costruttore utilizzato dalle sottoclassi ArticoloNoir e ArticoloFantasy 
	 *per la creazione di un articolo con gia'compilato il campo di categoria e descrizione
	 * */
	public Articolo(String titolo2,Date data2,String testo2,Autore autore2,Tags tags2) {
		this.titolo=titolo2;
		this.data=data2;
		this.testo=testo2;
		this.autore=autore2;
		this.tags=tags2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getTesto() {
		return testo;
	}

	public Autore getAutore() {
		return autore;
	}

	public Date getData() {
		return data;
	}

	public String getCategoria() {
		return categoria;
	}

	public Tags getTags() {
		return tags;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	/*Metodo utilizzato per convertire in stringa l'intero articolo e le sue proprieta' con interazione has-a
	 * */
	public String toString() {
		String artToString="";
		
		artToString=
		"\n"+this.titolo
		+"\n"+this.testo
		+"\n"+"Autore "+this.autore.getNome()+" "+this.autore.getCognome()
		+"\n"+" "+"Data:"+this.data.toString()+
		"\n"+"Categoria:"+this.categoria+" "+"\n"+"Tags:"+this.tags.toString()
		+"\n";
		
		return artToString;
	}
	
}
