package business;

public class Disciplina {

	private String codigo;
	private String ementa;
		
	public String getCodigo() {
		return codigo;
	}
	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Disciplina(String codigo, String ementa) {
		super();
		this.codigo = codigo;
		this.ementa = ementa;
	}	
	
}
