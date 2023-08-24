package business;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String brincar() {
		return "O cachorro está brincando de pegar bolinha...";
	}
	
	public String latir () {
		return "Au-Au";
	};
}
