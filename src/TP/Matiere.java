package TP;

public class Matiere {
	String libelle;
	Enseignant [] enseignants;
	double coefficient;
	

	public Matiere (String libelle, Enseignant [] enseignants, double coefficient) {
		this.libelle=libelle;
		this.enseignants=enseignants;
		this.coefficient=coefficient;
		
	}
}
