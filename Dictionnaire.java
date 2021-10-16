public class Dictionnaire extends Media{
	private String langue;
	private int nb_tomes;

	public Dictionnaire(String titre, String langue, int nb_tomes){
		super(titre);
		this.langue = langue;
		this.nb_tomes = nb_tomes;
	}
	@Override
	public String toString(){
		return super.toString()+" - Langue: "+this.langue + " - Nb Tomes: "+this.nb_tomes;
	}
	@Override
	public int ordreMedia(){
		return 1; 
	}
}