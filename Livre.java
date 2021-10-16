public class Livre extends Media{
	private String auteur;
	private int nb_pages;

	public Livre(String titre, String auteur, int nb_pages){
		super(titre);
		this.auteur = auteur;
		this.nb_pages = nb_pages;
	}
	@Override
	public String toString(){
		return super.toString()+" - Auteur: "+this.auteur + " - Nb Pages: "+this.nb_pages;
	}

	@Override
	public int ordreMedia(){
		return 2; 
	}

	// @Override
	// public boolean plusPetit(Media doc){
	// 	// System.out.println("plus petit livre");
	// 	if(!(doc instanceof Livre)){
	// 		return false;
	// 	}else{
	// 		return super.plusPetit(doc);
	// 	}
	// }
}