package cartes;

public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + "En recouvrant une carte Limite de Vitesse avec celle ci, "
				+ "cela met fin à la limite";
	}
	

}
