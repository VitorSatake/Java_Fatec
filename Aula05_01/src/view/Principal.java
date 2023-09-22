package view;

import business.Aluno;
import business.Aula;
import business.Disciplina;
import business.Materia;
import business.Professor;

public class Principal {

	public static void main(String[] args) {
		
		Professor professor = new Professor("Rubens Lara", 123);
		
		Disciplina disciplina = new Disciplina("ELE2");
		
		Aula aula = new Aula(professor, disciplina);
		
		aula.inserirAluno(new Aluno("Leila", "1001"));
		aula.inserirAluno(new Aluno("Marcos", "1002"));
		aula.inserirAluno(new Aluno("Rhayadh", "1003"));
		aula.inserirAluno(new Aluno("Suelaine", "1004"));
		aula.inserirAluno(new Aluno("Vitor", "1005"));
		
		aula.setMateria(new Materia("Revisao 00"));
		
		System.out.println(aula.retornarInfo());

	}

}
