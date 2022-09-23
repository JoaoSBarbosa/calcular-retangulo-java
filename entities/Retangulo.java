package entities;

public class Retangulo {
	
	// Atributos
	public double width, height;
	
	// M�todo para calcular a �rea
	public double area() {
		return width * height;
	}
	
	// M�todo para calcular o per�metro
	public double perimeter() {
		// P = 2 x (b + h)
		return 2 * (width + height);
	}

	// M�todo para calcular diagonal
	public double diagonal() {
		// d = raiz quadrada de b ao quadrado + h ao quadrado
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}
	
	
	
}
