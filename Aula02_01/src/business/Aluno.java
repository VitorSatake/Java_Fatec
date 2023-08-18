package business;

public class Aluno extends Pessoa {
	
	private String ra;
	
	public String getRA() {return ra;}
	
	
	public Aluno(String nome, String email) {
		super(nome, email);
		this.ra = ra;
	}
}
