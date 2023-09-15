package business;

public class Moto extends Veiculo {

	private boolean descansoAcionado;

	public boolean isDescansoAcionado() {
		return descansoAcionado;
	}
	
	public Moto(String nome, String fabricante, int ano) {
		super(nome, fabricante, ano);
	}

	@Override
	public void acelerar() {
		super.acelerar();
		descansoAcionado = false;
	}

	@Override
	public void desacelerar() {
		super.desacelerar();

		descansoAcionado = (velocidade == 0);
}
	
	@Override
	public void parar() {
		super.parar();
		descansoAcionado = true;
	}

	@Override
	public String toString() {
		return super.toString() + "; apoio acionado: " + descansoAcionado;
	}
	
	
}

