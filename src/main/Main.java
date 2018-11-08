package main;

import model.Classe;
import model.Niveau;
import model.Student;
/* pour te permettre de tester
 * si tu veux avoir une affichage comme celle donner sur le sujet du profe juste y'a  
 * une mise en forme a faire dans les methode tostring si tout 
 * 
 */
public final class Main {
	public static void main(String[] args) {
		Student st = new Student("haras", "L3130896", "2017-2018");
		st.setClasseActuelle("L32018-2019");
		st.addRedoublemet("n'a jamais redoublé");
		st.addRedoublemet("ne redouble jamais");
		st.addPromotion("L32018-2019");
		st.addPromotion("L32018-2019");
		System.out.println(st.toString());
		System.out.println("-----------------------------------------------");
		Classe cl =new Classe(Niveau.L3, "2018-2019");
		cl.addEtudiant(st);
		System.out.println(cl.toString());
	}

}
/*
 * des question ou des explications n'hesite pas à me demander 
 */