public class TitreCommencePar extends Predicat{
	private char lettre;

	public TitreCommencePar(char lettre){
		this.lettre = Character.toUpperCase(lettre);
	}

	@Override
	public boolean estVrai(Media m){
		char c = Character.toUpperCase(m.getTitre().charAt(0));
		if(lettre==c){
			return true;
		}else{
			return super.estVrai(m);
		}
	}
}