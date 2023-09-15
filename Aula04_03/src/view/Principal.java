package view;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("*******Estacionamento*******");
		System.out.println("Informe o veiculo desejado: (C)Carro ou (M)Moto: ");
		
		// objeto "anônimo"
		//String input = new Scanner(System.in).next();
		
		// instancia elemento para receber dados do usuario
		Scanner input = new Scanner(System.in);
		String tipoVeiculo = input.next();
		
	}

}
