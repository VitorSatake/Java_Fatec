package business;

public class Gato extends Animal {
	
	public Gato(String nome) {
		super(nome);
	}

	@Override
	public String brincar() {
		return "O gato está brincando de pegar bola de pelo...";
	}
	
	public String miar () {
		return "Miau";
	};

}
