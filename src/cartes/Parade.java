package cartes;

import cartes.Probleme.Type;

public class Parade extends Bataille {

	public Parade(int n, Type t) {
		super(n, t);
	}
	
	public String choixNom(Type t) {
		
		switch (t) {
		case ACCIDENT: {
			return "Répération";
				
		}
		case CREVAISON:{
			return "Roue de secours";
				
		}
		case ESSENCE:{
			return "Essence";
				
		}
		case FEU:{
			return "Feu vert";			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + t);
		}
	}
	

	@Override
	public String toString() {
		return "La carte "+choixNom(getType())+ "permet de recouvrir la carte attaque correspondante.";
	}
	
	

}
