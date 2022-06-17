package main;
import java.util.Date;
import java.util.Scanner;

import main.Articolo.Articolo;
import main.Articolo.InfoArt.Autore;
import main.Articolo.InfoArt.Tags;
import main.Articolo.SpecialArt.ArticoloFantasy;
import main.Articolo.SpecialArt.ArticoloNoir;

public class Main {

	public static void main(String[] args) {
		Autore Daniele=new Autore(0,"Daniele", "Liburdi");
		Tags tagFavola=new Tags(new String[] {"Allegra","Divertente","+3"});
		
		Articolo art1=new Articolo("I quattro cantoni",new Date(),"Favola","C'erano una volta quattro cantoni che cantonavano in cantoni",Daniele,tagFavola);
		Articolo art2=new Articolo("I tre barilotti",new Date(),"Favola","C'erano una volta tre barilotti che barilavano in barili",Daniele,tagFavola);
		Articolo artFantasy=new ArticoloFantasy("Alla conquista dell'anello Malvagio", new Date(), "Due viandanti in cerca dell'annello di Mordor", Daniele, tagFavola);
		Articolo artNoir=new ArticoloNoir("Chi ha ucciso l'uomo Ragno", new Date(), "Il famigerato Detective Conan cerca l'assassino dell'uomo ragno", Daniele, tagFavola);
		Articolo newArt=Daniele.scriviArticolo("Tre galline sul como'", new Date(),"Favola", "Tre galline viaggiavano alla velocita'della luce sul como'", tagFavola);
				
		Blog mondadoriBlog=new Blog(new Articolo[] {});
		
		sceltaStampa(mondadoriBlog);
	}
	
	static void sceltaStampa(Blog blog) {
		Scanner sc=new Scanner(System.in);
		System.out.println("scegli cosa stampare"+"\n"+"Scegli 1: per Stampare tutti gli articoli"
		+"\n"+"Scegli 2: per Stampare un articolo specifico tramite id");
		
		int numero=Integer.parseInt(sc.nextLine());
		
		if(numero==1) {
			stampaTutto(blog);
		}
		else if(numero==2) {
			stampaPerId(blog);
		}
	}
	
	static void stampaTutto(Blog blog) {
		if(blog.getArtsInMem().length>0) {
			blog.stampaArticoli();
		}
		else {
			System.out.println("Non ci sono articoli");
		}
	}
	
	static void stampaPerId(Blog blog) {
		if(blog.getArtsInMem().length>0) {
			System.out.println("==================LISTA ARTICOLI===================");
			for(int i=0;i<blog.getArtsInMem().length;i++) {
				System.out.println("\n"+blog.getArtsInMem()[i].getTitolo()+" | id:"+blog.getArtsInMem()[i].getId());
			}
			System.out.println("===================================================");
			System.out.println("scegli l'id di quale articolo stampare dalla lista qui sopra");
			
			Scanner sc=new Scanner(System.in);
			int numero=Integer.parseInt(sc.nextLine());
			blog.stampaArticoloPerId(numero);
		}
		else {
			System.out.println("Non ci sono articoli");
		}
	}

}
