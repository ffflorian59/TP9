package TP;

public class College {
	String designation;
	Adresse adresse;
	static int nbrCollege;
	

	public College() {
		super();
		// TODO Auto-generated constructor stub
		nbrCollege++;
	}


	public College (String designation, Adresse adresse) {
		this.designation=designation;
		this.adresse=adresse;
		}
}
