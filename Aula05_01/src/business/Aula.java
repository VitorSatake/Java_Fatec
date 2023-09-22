package business;

import java.util.ArrayList;

public class Aula {

	private Professor professor;
	private Disciplina disciplina;
	private Materia materia;
	private ArrayList<Aluno> listagemAlunos;
	
	public Aula(Professor professor, Disciplina disciplina) {
		// inicializa professor e disciplina com "objetos" recebidos via parâmetro
		this.professor = professor;
		this.disciplina = disciplina;
		
		
		this.listagemAlunos = new ArrayList<Aluno>();
	}


	public void setMateria(Materia materia) { this.materia = materia; }
	public Materia getMateria() { return materia; }

	public Professor getProfessor() { return professor; }

	public Disciplina getDisciplina() { return disciplina; }

	public void inserirAluno(Aluno aluno) {
		listagemAlunos.add(aluno);
	}
	public ArrayList<Aluno> getListagemAlunos() { return listagemAlunos; }

	public String retornarInfo() {
		String infoAula = "***Aula de hoje***";
		
		infoAula += "\nDisciplina: " + disciplina.getCodigo();
		infoAula += "\nProfessor: " + professor.getNome();
		infoAula += "\nMateria: " + materia.getTopico();
		infoAula += "\nAlunos Presentes: ";
		
		//percorre lista e concatena nome dos alunos
		for(Aluno alunoTemp: listagemAlunos) {
			infoAula += "\n - " + alunoTemp.getNome();
		}
		
		return infoAula;
	}


	@Override
	public String toString() {
		return retornarInfo();
	}

}
