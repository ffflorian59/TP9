package TP;

public class Department {
	String designation;
	College college;
	static int nbrDepartment;

	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
		nbrDepartment++;
	}


	public Department (String designation, College college) {
		this.designation=designation;
		this.college=college;
		
	}
}
