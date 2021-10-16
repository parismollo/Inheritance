public class DictionnaireBilingue extends Dictionnaire{
	private String second_langue;

	public DictionnaireBilingue(String titre, String langue, int nb_tomes, String second_langue){
		super(titre, langue, nb_tomes);
		this.second_langue = second_langue;
	}
	
	@Override
	public String toString(){
		return super.toString()+" - second_langue: "+this.second_langue;
	}
}