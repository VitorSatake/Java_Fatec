package business;

public class Data {
	private int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getData() {
		return String.format("%2d/%2d/%2d", dia, mes, ano);
	}

}
