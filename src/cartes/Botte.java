package cartes;

public class Botte extends Probleme {

	public Botte(int n, Type t) {
		super(n, t);
	}
	
	public String choixNom(Type t) {
		
		switch (t) {
		case ACCIDENT: {
			return"AS DU VOLANT";
			
		}
		case CREVAISON:{
			return"INCREVABLE";
			
		}
		case ESSENCE:{
			return"CITERNE D’ESSENCE";
			
		}
		case FEU:{
			return"VÉHICULE PRIORITAIRE";
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + t);
		}
		
	}

	@Override
	public String toString() {
		return "Une fois que vous avez posé cette Botte "+ choixNom(getType()) + ", vos adversaires ne peuvent"
				+ " plus vous attaquer avec une carte " + getType()+ "ou Limite de Vitesse.";
	}
	
	

}
