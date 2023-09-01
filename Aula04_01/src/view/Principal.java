package view;

import business.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Fatec", 31, 12, 1986);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Nascimento: " + pessoa1.getNascimento());
		
	}
}
