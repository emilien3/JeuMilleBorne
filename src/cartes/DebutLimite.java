package cartes;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Elle l’empêche de poser des cartes Bornes supérieures à 50 km.";
	}

}
