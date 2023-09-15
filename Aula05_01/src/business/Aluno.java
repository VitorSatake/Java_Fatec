package business;

public class Aluno extends Pessoa {

	private String matricula;
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, String email) {
		super(nome, email);
	}

}
