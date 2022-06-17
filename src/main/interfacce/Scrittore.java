package main.interfacce;

import java.util.Date;

import main.Articolo.Articolo;
import main.Articolo.InfoArt.Tags;

public interface Scrittore {

	public Articolo scriviArticolo(String titolo,Date data,String categoria,String testo,Tags tags);
	
}
