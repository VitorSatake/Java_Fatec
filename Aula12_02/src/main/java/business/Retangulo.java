package business;

public class Retangulo extends Figura {
	
	private float base, altura;

	public float getBase() {return base;}

	public void setBase(float base) {this.base = base;}

	public float getAltura() {return altura;}

	public void setAltura(float altura) {this.altura = altura;}

	@Override
	public void calcularArea() {
		area = base * altura;
		
	}

	@Override
	public float getArea() {
		
		return area;
	}

}
