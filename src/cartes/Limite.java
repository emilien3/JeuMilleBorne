package cartes;

public abstract class Limite extends Carte {

	protected Limite(int nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return "Cette carte se place sur la pile de Vitesse d'un adversaire.";
	}

}
