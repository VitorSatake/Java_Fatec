package view;


import java.util.Scanner;
import business.Adicao;
import business.Subtracao;
import business.Multiplicacao;
import business.Divisao;

public class Principal {

	public static void main(String[] args) {
		
		//instancia objeto para receber dados do usuario
		Scanner entrada = new Scanner(System.in);

		System.out.println("Calculadora");
		
		//Solicita ao usuario informaçoes sobre os pets
		System.out.println("Informe a operação a ser realizada: ");
		String escolha = entrada.next();
		
		switch(escolha) {
		case "1":
			System.out.println();
			int valor1 = entrada.next();
			
		case "2":
			
			
		case "3":
			
		
		case "4":
			
			
			default:
				System.out.println("Numero indefinido");
				System.exit(0);			
			
		}
	}

}
