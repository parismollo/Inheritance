public class Media{
	private final String titre;
	private static int compteur_midia = 0;
	private final int numero_enregistrement;

	public Media(String titre){
		this.titre = titre;
		this.numero_enregistrement = compteur_midia;
		update_compteur_midia();
	}
	public String getTitre(){
		return this.titre;
	}
	public int getNumeroEnregistrement(){
		return this.numero_enregistrement;
	}
	public String toString(){
		return "Object Class: "+getClass() + " - Titre: "+getTitre()+" - n: "+getNumeroEnregistrement();
	}
	private void update_compteur_midia(){
		compteur_midia++;
	}
	public boolean plusPetit(Media doc){
		int a = ordreMedia();
		int b = doc.ordreMedia();
		if(a<b){
			return true;
		}else if(a==b){
			if(this.numero_enregistrement<doc.getNumeroEnregistrement()) {
				return true;
			}
			return false;
		}else{
			return false;
		}
	}
	// public boolean plusPetit(Livre doc){
	// 	if(!(this instanceof Livre) && doc instanceof Livre){
	// 		return true;
	// 	}else{
	// 		if(this.numero_enregistrement<doc.getNumeroEnregistrement()){
	// 			return true;	
	// 		} 
	// 	}
	// 	return false;
	// }

	public int ordreMedia(){
		return 0; 
	}
}