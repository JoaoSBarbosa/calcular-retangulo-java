package entities;

public class Retangulo {
	
	// Atributos
	public double width, height;
	
	// Método para calcular a área
	public double area() {
		return width * height;
	}
	
	// Método para calcular o perímetro
	public double perimeter() {
		// P = 2 x (b + h)
		return 2 * (width + height);
	}

	// Método para calcular diagonal
	public double diagonal() {
		// d = raiz quadrada de b ao quadrado + h ao quadrado
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}
	
	
	
}
