package TP;

public class Adresse {
int num;
String rue;
String ville;
String codepostal;
static int nbrAdresse;


public Adresse() {
	super();
	// TODO Auto-generated constructor stub
	nbrAdresse++;
}


public Adresse (int num, String rue, String ville, String codepostal) {
	this.num=num;
	this.rue=rue;
	this.ville=ville;
	this.codepostal=codepostal;
}
}
