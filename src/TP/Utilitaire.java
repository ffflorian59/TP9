package TP;



public class Utilitaire {
	static String parcourirTableau1(Matiere[] tabmat) {
		String somme=tabmat[0].libelle;
		for (int i=1;i<tabmat.length;i++) {
			somme= somme + "" + tabmat[i].libelle;
		}
		return somme;
		
		
	
	}
	
	static String parcourirTableau2(Enseignant[] codep) {
		String cp=codep[0].adresse.codepostal;
		for (int i=1;i<codep.length;i++) {
			cp= cp + "" + codep[i].adresse.codepostal;
		}
		return cp;
	}
	
	static String [] parcourirTableau3(Matiere tabmat2) {
		String[] villeretour= new String [tabmat2.enseignants.length];
		for (int i=0;i<tabmat2.enseignants.length;i++) {
			
			villeretour[i]= tabmat2.enseignants[i].adresse.ville;
		}
		for(int i=0; i<villeretour.length;i++) {
			System.out.println(villeretour[i]);
		}
		return villeretour;
	}
}
