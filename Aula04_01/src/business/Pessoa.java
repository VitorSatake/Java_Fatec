package business;

public class Pessoa {
	private String nome;
	private Data nascimento;
	
	public String getNome() {return nome;}
	public Data getNascimento() {return nascimento;}
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.nascimento = new Data(dia, mes, ano);
	}
}
