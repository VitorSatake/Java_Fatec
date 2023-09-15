package business;

public abstract class Veiculo {
	private String nome;
	private String fabricante;
	private int ano;
	protected int velocidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
		
	public Veiculo(String nome, String fabricante, int ano) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.ano = ano;
	}
	
	public void acelerar() {
			velocidade += 5;
	}
	
	public void desacelerar() {
			velocidade -= 5;
	}
	
	public void parar() {
		velocidade = 0;
	}
	
	@Override
	public String toString() {
		return String.format("Veiculo? %s; velocidade atual: %d km/h",
				nome, velocidade);
	}
	
}
