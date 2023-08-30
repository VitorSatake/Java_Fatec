package view;

import java.util.Scanner;

import business.Adicao;
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
		
		// declara variavel para receber o resultado
		float resultado = 0;
		
		switch (opcao) {
			case 1: 
				Adicao objAdicao = new Adicao(v1, v2);
				objAdicao.calcular();
				resultado = objAdicao.getResultado();
				System.out.println(String.format("Resultado da %.2f", resultado));
				break;
			case 2: 
				Subtracao objSubtracao = new Subtracao(v1, v2);
				objSubtracao.calcular();
				resultado = objSubtracao.getResultado();
				System.out.println(String.format("Resultado da %.2f", resultado));
				break;
			case 3: 
				Multiplicacao objMultiplicacao = new Multiplicacao(v1, v2);
				objMultiplicacao.calcular();
				resultado = objMultiplicacao.getResultado();
				System.out.println(String.format("Resultado da %.2f", resultado));
				break;
			case 4: 
				Divisao objDivisao = new Divisao(v1, v2);
				objDivisao.calcular();
				resultado = objDivisao.getResultado();
				System.out.println(String.format("Resultado da %.2f", resultado));
				break;
			}
		
	}

}
