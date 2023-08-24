package view;

import java.util.Scanner;
import business.Cachorro;
import business.Gato;

public class Principal {

	public static void main(String[] args) {
		
		//instancia objeto para receber dados do usuario
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pet-Ground - play ground para pets");
		
		//Solicita ao usuario informaçoes sobre os pets
		System.out.println("Informe o nome do cachorro: ");
		String nomeCachorro = entrada.next();
		System.out.println("Informe o nome do gato: ");
		String nomeGato = entrada.next();
		
		//Instancia obheto do tipo cachorro
		Cachorro cao1 = new Cachorro(nomeCachorro);
		//Instancia obheto do tipo gato
		Gato gato1 = new Gato(nomeGato);
		
		//Exibe as informações do 1º cachorro cadastrado
		System.out.println(String.format("O cachorro %s está latindo: %s.", 
				cao1.getNome(), cao1.latir()));
		System.out.println(cao1.brincar()+"\n");
		
		//Exibe as informações do 1º gato cadastrado
		System.out.println(String.format("O gato %s está miando: %s.", 
					gato1.getNome(), gato1.miar()));
		System.out.println(gato1.brincar());
	}

}
