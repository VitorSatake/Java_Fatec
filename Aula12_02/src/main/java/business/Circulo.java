package business;

public class Circulo extends Figura {

	private float raio;
	
	
	
	public float getRaio() {return raio;}

	public void setRaio(float raio) {this.raio = raio;}

	@Override
	public void calcularArea() {
		area = (float)(Math.pow(raio, 2) * Math.PI);
		
	}

	@Override
	public float getArea() {
		
		return area;
	}


}
