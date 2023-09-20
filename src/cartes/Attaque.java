package cartes;

import cartes.Probleme.Type;

public class Attaque extends Bataille {

	public Attaque(int n, Type t) {
		super(n, t);
	}
	
	public String formatNom(Type type){
		return null;
		
	}
	
	public String choixNom(Type t) {
		
		switch (t) {
		case ACCIDENT: {
			return "Accident";
				
		}
		case CREVAISON:{
			return "Crevaison";
				
		}
		case ESSENCE:{
			return "Panne d'essence";
				
		}
		case FEU:{
			return "Feu rouge";			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + t);
		}
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Cette carte "+choixNom(getType())+ " l’empêche de poser de nouvelles cartes Bornes,"
				+ " jusqu’à ce qu’il recouvre cette attaque d’une carte " +getType();
		
	}
	
	
	
	
	

}
