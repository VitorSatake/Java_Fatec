package view;

import java.util.Scanner;

import business.Adicao;
import business.Calculo;
import business.Divisao;
import business.Multiplicacao;
import business.Subtracao;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Calculadora com POO");

		// exibe mensagem informativa ao usuário
		System.out.print("Informe a operação desejada:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
		
		// instancia objeto para leitura de dados
		Scanner entrada = new Scanner(System.in);
		
		// recebe valor com operação desejada
		int opcao = entrada.nextInt(); 

		// valida a opção recebida
		if (opcao < 1 || opcao > 4) {
			System.err.println("Opção inválida.");
			return;
		}
			
		// recebe os 2 valores esperados
		System.out.print("Informe o valor 1: ");
		float v1 = entrada.nextFloat();
		System.out.print("Informe o valor 2: ");
		float v2 = entrada.nextFloat();

		Calculo calc = null;
		switch (opcao) {
			case 1: calc = new Adicao(v1, v2); break;
			case 2: calc = new Subtracao(v1, v2); break;
			case 3: calc = new Multiplicacao(v1, v2); break;
			case 4: calc = new Divisao(v1, v2); break;
			}
		calc.calcular();
		System.out.println(String.format("Resultado da %.2f", calc.getResultado()));

		
	}

}