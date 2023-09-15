package business;

public abstract class Pessoa {
	
	private String nome;
	private String email;	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	

}
