package main.Articolo.InfoArt;

import java.util.Date;

import main.Articolo.Articolo;
import main.interfacce.Scrittore;

public class Autore implements Scrittore {

	private int id;
	private String nome;
	private String cognome;
	
	public Autore(int id,String nome,String cognome){
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override 
	 /*
	  * Metodo utilizzato per la creazione di un nuovo articolo, avendo giá di base stabilito l'autore 
	  * */
	public Articolo scriviArticolo(String titolo, Date data, String categoria, String testo, Tags tags) {
		
		Articolo newArt=new Articolo(titolo,data,categoria,testo,new Autore(this.id,this.getNome(),this.getCognome()),tags);
		
		return newArt;
	}
	
}
