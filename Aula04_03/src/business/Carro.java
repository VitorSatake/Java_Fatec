package business;

public class Carro extends Veiculo {

	private int qntPortas;

	public int getQntPortas() {
		return qntPortas;
	}
	
	public Carro(String nome, String fabricante, int ano, int qntPortas) {
		super(nome, fabricante, ano);
	}

	@Override
	public void acelerar() {
			velocidade += 10;		
	}
}