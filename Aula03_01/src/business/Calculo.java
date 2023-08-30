//
//- Faça um novo projeto chamado "Aula03_01". Nele deverá haver a classe "Principal" (no pacote "view") e uma outra 
//chamada "Calculo",que deverá ser abstrata e estar no pacote "business";
//
//- na classe abstrata "Calculo", crie os atributos "valor1", "valor2" e "resultado", do tipo float; 
//encapsule todos os atributos, mas deixe o "resultado" ser apenas de leitura ("get");
//
//- as operações aritméticas deverão ficar, cada qual, numa classe com o nome da operação correspondente
//(o que irá gerar as classes Adicao, Subtracao, Multiplicacao e Divisao).
//Essas classes deverão herdar da classe abstrata Calculo, descrita acima, que, por sua vez, deverá implementar 
//a interface ICalculo (também presente no pacote "business"), descrita abaixo:
//
//interface ICalculo {
//   void calcular(); 
//}
//- por fim, na classe Principal, solicite ao usuário para informar a operação desejada,
//	bem como os valores a serem trabalhados. De posse dessas informações,
//	instancie a classe correspondente, realize o cálculo e apresente o resultado.
//Dica: para receber os dados do usuário, utilize Scanner ou JOptionPane.showInputDialog.


package business;

public abstract class Calculo implements ICalculo {
	
	protected float valor1;
	protected float valor2;
	protected float resultado;
	
//	public float getValor1() {
//		return valor1;
//	}
//	public void setValor1(float valor1) {
//		this.valor1 = valor1;
//	}
//	public float getValor2() {
//		return valor2;
//	}
//	public void setValor2(float valor2) {
//		this.valor2 = valor2;
//	}
	//ou
	
	public Calculo(float valor1, float valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public float getResultado() {
		return resultado;
	}


}
	