package business;

public class Materia {
	
	private String topico;
	private String descricao;
	
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public Materia(String topico, String descricao) {
		this.topico = topico;
		this.descricao = descricao;
	}
		
}
