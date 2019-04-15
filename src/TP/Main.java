package TP;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse ad1= new Adresse(35,"hegel","Lille","59640");
		Adresse ad2= new Adresse(78,"galilee","Loos","59000");
		Adresse ad3= new Adresse(101,"Boulevard_fouque","Dunkerque","59240");
		Adresse ad4= new Adresse(265,"adaming","Paris","75000");
		
		College Col1= new College("Victor Hugo",ad1);
		College Col2= new College("Boris Vian",ad2);
		College Col3= new College("Europe",ad3);
		College Col4= new College("Fernand Léger",ad4);
		
		Department dpt1= new Department("energie",Col1);
		Department dpt2= new Department("RH",Col2);
		Department dpt3= new Department("Math",Col3);
		Department dpt4= new Department("Physique",Col4);
		
		Enseignant e1= new Enseignant("acool","antoine",28,dpt1,ad1);
		Enseignant e2= new Enseignant("guibourg","antonin",27,dpt2,ad2);
		Enseignant e3= new Enseignant("Renault","clément",25,dpt3,ad3);
		Enseignant e4= new Enseignant("Libre","Florian",27,dpt4,ad4);
		
		Enseignant[] tab1= {e1,e4};
		Enseignant[] tab2= {e2,e3};
		Enseignant[] tab3= {e1,e3};
		Enseignant[] tab4= {e3,e4};
		Matiere Ma1 = new Matiere("energie",tab1,3);
		
		Matiere Ma2 = new Matiere("RH",tab2,6);
		
		Matiere Ma3 = new Matiere("Math",tab3,1.5);
		
		Matiere Ma4 = new Matiere("Physique",tab4,4.5);
		Matiere[] tabmat= {Ma1,Ma2,Ma3,Ma4};
		Enseignant[] codep= {e1,e2,e3,e4};
		System.out.println(Utilitaire.parcourirTableau1(tabmat));
		System.out.println(Utilitaire.parcourirTableau2(codep));
		System.out.println(Utilitaire.parcourirTableau3(Ma1));
		System.out.println(Adresse.nbrAdresse);
		
		
	
		
	
		
		
		
		
		
	}

}
