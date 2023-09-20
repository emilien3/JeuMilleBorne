package test;
import cartes.*;
import cartes.Probleme.Type;

public class Test {

	public Test() {
	}
	
	public static void main(String[] args) {
		Attaque test = new Attaque(10, Type.FEU);
		System.out.println( test.toString());
	}

}
