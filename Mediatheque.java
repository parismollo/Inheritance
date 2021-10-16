import java.util.*;
class Mediatheque{
	private LinkedList<Media> medias;

	public Mediatheque(){
		this.medias = new LinkedList<>();
	}

	public String toString(){
		return this.medias.toString();
	}
	public void ajouter(Media doc){
		boolean added = false;
		for(int i=0; i<medias.size(); i++){
			if(doc.plusPetit(medias.get(i))){
				medias.add(i, doc);
				added = true;
				break;
			}
		}
		if(!added){
			medias.add(doc);
		}
		if(medias.size()==0){
			System.out.println("E");
			medias.add(doc);
		}
	}
	public void tousLesDictionnaires(){
		for(Media media:this.medias){
			if(media instanceof Dictionnaire){
				System.out.print(media+" ");
			}
		}
	}

	public ArrayList<Media> recherche(Predicat p){
		ArrayList<Media> arr = new ArrayList<>();
		for(Media media:medias){
			if(p.estVrai(media)){
				arr.add(media);
			}
		}
		return arr;
	}

	public static void main(String args[]){
		System.out.println("   Tests Mediatheque   ");

		System.out.println("---Exercice 1---");
		Media media = new Media("Rocky III");
		System.out.println(media);
		Media media2 = new Media("Rock II");
		System.out.println(media2);
		System.out.println("Plus petit:"+media.plusPetit(media2));
		System.out.println("Plus petit:"+media2.plusPetit(media));
		System.out.println("\n---Exercice 2---");

		Livre livre = new Livre("Albert", "Isaac", 300);
		System.out.println(livre);

		DictionnaireBilingue dict_bi = new DictionnaireBilingue("French Dictionnaire", "FR", 150, "PT");
		Manga manga = new Manga("Naruto", "Mikoshi", 1000, 2);
		System.out.println(dict_bi);
		System.out.println(manga);
		Dictionnaire dict = new Dictionnaire("Lorem Ipsu", "FR", 100);
		System.out.println(dict);

		System.out.println("\n---Exercice 3 et 4---");
		Mediatheque mediatheque = new Mediatheque();
		mediatheque.ajouter(manga);
		mediatheque.ajouter(dict);
		mediatheque.ajouter(livre);
		mediatheque.ajouter(dict_bi);
		System.out.println(mediatheque);
		System.out.println("\n");
		mediatheque.tousLesDictionnaires();

		// System.out.println("\n"+livre.plusPetit(manga)); // true
		// System.out.println("\n"+livre.plusPetit(dict_bi)); // false
		System.out.println("\n---Exercice 5---");
		EstUnLivre checker = new EstUnLivre();
		System.out.println(checker.estVrai(manga));
		Media livre2 = new Livre("SaVinci", "Leonardo", 500);
		mediatheque.ajouter(livre2);
		System.out.println(checker.estVrai(livre2));	
		System.out.println(checker.estVrai(dict_bi));

		System.out.println(mediatheque.recherche(checker));

		TitreCommencePar tcp = new TitreCommencePar('n');
		System.out.println(mediatheque.recherche(tcp));
		Et et = new Et(new TitreCommencePar('s'), new EstUnLivre());
		System.out.println(mediatheque.recherche(et));

	}
}