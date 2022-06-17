package main.Articolo.InfoArt;

public class Tags {
	private String[] tags;
	
	public Tags(String[] tags){
		this.tags=tags;
	}
	
	@Override
	/*Metodo utilizzato per convertire in stringa il contenuto dell'array Tags
	 * */
	public String toString() {
		String tagsPresenti="";
		for(int i=0;i<this.tags.length;i++) {
			tagsPresenti+=(" "+tags[i]);
		}
		return tagsPresenti;
	}
}
