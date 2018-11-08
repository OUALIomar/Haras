package model;
import java.util.ArrayList;

public class Student {
	
	protected String nom;
	protected String  numEtudiant;
	protected String anneeAdmision;
	protected String classeActuelle;
	protected ArrayList<String> redoublements;
	protected ArrayList<String> promotions;
	
	public Student(String nom, String numEtudiant, String anneeAdmision) {	
		this.nom = nom;
		this.numEtudiant = numEtudiant;
		this.anneeAdmision = anneeAdmision;
		this.redoublements = new ArrayList<String>();
		this.promotions = new ArrayList<String>();
	}

	public void setClasseActuelle(String classeActuelle) {
		this.classeActuelle = classeActuelle;
	}
	public void addRedoublemet(String r) {
			this.redoublements.add(r);
	}
	public void addPromotion(String r) {
		if(!this.promotions.contains(r)) {
			this.promotions.add(r);
		} else {
			System.out.println("ajout impossible  => promotion deja existante!");
		}
	}

	@Override
	public String toString() {
		return  
				"Student : \n"+
				nom +"\n"+ 
				numEtudiant +"\n"+
				anneeAdmision+"\n"+ 
				classeActuelle +"\n"+
				redoublements +"\n"+  
				promotions ;
	}


}
