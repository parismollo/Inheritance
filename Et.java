public class Et extends Predicat{
	Predicat p1;
	Predicat p2;

	public Et(Predicat p1, Predicat p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	public boolean estVrai(Media m){
		if(p1.estVrai(m) && p2.estVrai(m)){
			return true;
		}
		return false;
	}
}