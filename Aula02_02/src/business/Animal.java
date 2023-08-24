package business;

abstract class Animal {
	
	private String nome;
	private int idade;
	private float peso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public abstract String brincar();
	
}
