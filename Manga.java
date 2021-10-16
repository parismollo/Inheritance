public class Manga extends Livre{
	private int numero_edition;

	public Manga(String titre, String auteur, int nb_pages, int numero_edition){
		super(titre, auteur, nb_pages);
		this.numero_edition = numero_edition;
	}

	@Override
	public String toString(){
		return super.toString()+" - numero_edition: "+this.numero_edition;
	}
}