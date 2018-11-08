package model;

import java.util.ArrayList;

public class Classe {
	protected Niveau niveau;
	protected String annee;
	protected ArrayList<Student> etudiants;
	
	
	public Classe(Niveau niveau, String annee) {
		this.niveau = niveau;
		this.annee = annee;
		this.etudiants = new ArrayList<Student>();
	}


	public Niveau getNiveau() {
		return niveau;
	}


	public String getAnnee() {
		return annee;
	}


	public ArrayList<Student> getEtudiants() {
		return etudiants;
	}
	
	public void addEtudiant(Student st) {
		this.etudiants.add(st);
	}
	public void removeEtudiant(Student st) {
		if(this.etudiants.contains(st)) {
			this.etudiants.remove(st);
		}else {
			System.out.println("Erreur dossier inexistant!!");
		}
	}
	
	@Override
	public String toString() {
		return  
				"Classe : \n"+
				niveau +"\n"+ 
				annee +"\n"+
				etudiants+"\n" ;
	}
}
