package business;

public class Subtracao extends Calculo {

	public Subtracao(float valor1, float valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcular() {
		resultado = valor1 - valor2;

	}

}