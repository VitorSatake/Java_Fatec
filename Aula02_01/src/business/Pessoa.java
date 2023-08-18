package business;

abstract class Pessoa {
	
	protected String nome;
	private String email;
	

	public String getNome() {return nome;}

	public String getEmail() {return email;}

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public String cumprimentar() {
		return String.format("Ola, meu nome é %s.", nome);
	}
	

}
