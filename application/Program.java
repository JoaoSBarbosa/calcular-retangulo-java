/* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
   sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("-> ");
		retangulo.height = sc.nextDouble();
		System.out.print("-> ");
		retangulo.width = sc.nextDouble();
		System.out.println();
		
		System.out.println("AREA       =   "+ String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETER  =   "+ String.format("%.2f", retangulo.perimeter()));
		System.out.println("DIAGONAL   =   "+ String.format("%.2f", retangulo.diagonal()));
		
		System.out.println("-end-");
		
		sc.close();
	}
	

}
