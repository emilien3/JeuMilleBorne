package jeu;
import cartes.*;

public class Sabot {
	
	private Carte[] tabCartes = new Carte[110] ;
	private int nbCartes = 0;

	public Sabot(Carte[] tabCartes, int nbCartes) {
		this.tabCartes = tabCartes;
		this.nbCartes = nbCartes;
	}
	
	public boolean estVide(Carte [] pioche) {
		return pioche.length == 0;
	}

}
