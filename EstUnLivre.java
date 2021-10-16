public class EstUnLivre extends Predicat{

	@Override
	public boolean estVrai(Media m){
		if(m instanceof Livre){
			return true;
		}else{
			return super.estVrai(m);
		}
	}
}