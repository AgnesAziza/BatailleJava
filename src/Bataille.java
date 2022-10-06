import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bataille {

	public static void main(String[] args) {
		List<Carte> paquet = new ArrayList<Carte>();
		
		for (int i = 0; i<Carte.cardColor.length; i++) {
			for (int j = 0; j < Carte.valueCarte.length; j++) {
				Carte carte = new Carte(Carte.cardColor[i], Carte.valueCarte[j]);
				paquet.add(carte);
			}
		}
		Collections.shuffle(paquet);
		//Collections.shuffle est une méthode qui permet de mélanger
		List<Carte> head = (List<Carte>)paquet.subList(0, 26);
		List<Carte> tail = (List<Carte>)paquet.subList(26, 52);
		// La méthode subList permet de séparer le paquet de carte en 2 par rapport à l'index
		
		Joueur joueur1 = new Joueur(new ArrayList<Carte>(head));
		Joueur joueur2 = new Joueur(new ArrayList<Carte>(tail));
		// Caste en ArrayList pour utiliser .size() sinon jouerCarte() n'est pas possible
		
		
		while(!joueur1.pointCompteur() && !joueur2.pointCompteur()) {
			Carte carteJoueur1 = joueur1.jouerCarte();
			Carte carteJoueur2 = joueur2.jouerCarte();
			if (carteJoueur1.compareTo(carteJoueur2) > 0) {
				joueur1.gagnerCarte(carteJoueur1);
				joueur1.gagnerCarte(carteJoueur2);
				joueur1.incrementeCompteur();
			}
			else if (carteJoueur1.compareTo(carteJoueur2) < 0) {
				joueur2.gagnerCarte(carteJoueur1);
				joueur2.gagnerCarte(carteJoueur2);
				joueur2.incrementeCompteur();

			} else {
				joueur1.gagnerCarte(carteJoueur1);
				joueur2.gagnerCarte(carteJoueur2);
			}
			
		}
		if(joueur1.pointCompteur()) {
			System.out.println("joueur 1 a gagné !" + "\n cartes joueur 1 " + joueur1 + " \n cartes joueur 2 " + joueur2);
		} else {
			System.out.println("joueur 2 a gagné !" + "\n cartes joueur 2 " + joueur2 + " \n cartes joueur 1 " + joueur1);
		}	
	}	
}
