package business;

public class Professor extends Pessoa {
	
	private int matricula;
	
	public int getMatricula() { return matricula;}
	public void setMatricula(int matricula) {this.matricula = matricula;}
	
	public Professor(String nome, String email) {
	super(nome, email);
	
  }
	@Override
	public String cumprimentar() {
		return super.cumprimentar() + " Serei seu professor hoje.";
	}
	
	public String cumprimentar(String tratamento) {
		return String.format("Ola, meu nome é Prof. %s %s", tratamento, nome);
	}
	
	
}