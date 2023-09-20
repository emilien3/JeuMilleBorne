package cartes;

public abstract class Probleme extends Carte {
	
	public enum Type {FEU ,ESSENCE, CREVAISON, ACCIDENT};
	
	private Type type;
	

	protected Probleme(int n, Type t) {
		super(n);
		this.type = t;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Cette carte se place sur la pile de Bataille d'un adversaire qui roule.";
	}

}
