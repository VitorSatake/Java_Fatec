package business;

public class Materia {
	
	private String topico, descricao;

	public String getTopico() { return topico; }
	public void setTopico(String topico) { this.topico = topico; 	}

	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public Materia(String topico) {
		this.topico = topico;
	}
	
}
