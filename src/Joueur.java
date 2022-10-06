import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private List<Carte> carteJoueur = new ArrayList<Carte>();
	private int compteur;
	
	Joueur(List<Carte> carteJoueur) {
		this.carteJoueur = carteJoueur;
		this.compteur = 0;
	}
	
	public Carte jouerCarte() {
		if (carteJoueur.size() > 0 ) {
			return carteJoueur.remove(0);
		} else {
			return null;
		}

	}
	public void gagnerCarte(Carte carteRandom) {
		carteJoueur.add(carteRandom);
	}
	
	public void incrementeCompteur() {
		compteur++;
	}
	
	public boolean pointCompteur() {
		return compteur == 30;
		// si égale à 30 == true sinon et donc le 1er à atteindte 30 gagne
	}
	public String toString() {
		return "carte: " + carteJoueur.toString();
 	}
}
