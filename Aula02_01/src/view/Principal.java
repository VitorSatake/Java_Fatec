package view;

//import business.Pessoa; está como Friendly
import business.Aluno;
import business.Professor;

public class Principal {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno("Vitor", "vitor@fatec");
		System.out.println(aluno1.cumprimentar());
		
		Aluno aluno2 = new Aluno("Fabio", "fabio@fatec");
		System.out.println(aluno2.cumprimentar());
		//instacia objeto do tipo pessoa
		//Pessoa pessoa1 = new Pessoa("Rubens", "rubens@fatec.sp");
		
		//exibe mensagem de cumprimento da pessoa
		//System.out.println(pessoa1.cumprimentar());
		
		//instacia objeto do tipo professor exibe mensagem de cumprimento (override)
		Professor prof1 = new Professor("Rubens", "rubens@fatec");
		System.out.println(prof1.cumprimentar());
		
		//instacia objeto do tipo professor exibe mensagem de cumprimento (override)
		Professor prof2 = new Professor("Thiago", "thiago@fatec");
		System.out.println(prof2.cumprimentar());
		
		//instacia objeto do tipo professor exibe mensagem de cumprimento (overload)
		Professor prof3 = new Professor("Leonardo.", "leonardo@fatec");
		System.out.println(prof3.cumprimentar("Dr. "));
		
	}

}
