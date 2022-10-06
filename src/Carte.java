
public class Carte implements Comparable<Carte> {
	private CardColor couleur; 
	private int valeur;
	static int [] valueCarte = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
	static CardColor [] cardColor = {CardColor.PIQUE, CardColor.CARREAU, CardColor.TREFLE, CardColor.COEUR};
	 
	Carte(CardColor couleur, int valeur) {
		this.couleur = couleur; 
		this.valeur = valeur;
	}
	
	@Override
	public int compareTo(Carte carte) {
		return Integer.compare(this.valeur, carte.valeur);
		
	}
	
	public String toString() {
		String personnageCarteEtCarte = String.valueOf(valeur);
		switch(personnageCarteEtCarte) {
			case "11":
				personnageCarteEtCarte = "Valet";
			break;
			case "12":
				personnageCarteEtCarte = "Dame";
			break;
			case "13":
				personnageCarteEtCarte = "Roi";
			break;
			case "14":
				personnageCarteEtCarte = "As";
				
		}
		return "carte valeur " + personnageCarteEtCarte + " couleur " + couleur;
 	}
}
