package TP;

public class Enseignant {
	String nom;
	String prenom;
	int age;
	Department department;
	Adresse adresse;
	int nbrEnseignant;
	
	

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
		nbrEnseignant++;
		
	}



	public Enseignant (String nom, String prenom, int age, Department department, Adresse adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.department=department;
		this.adresse=adresse;
	}
}
