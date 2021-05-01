package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Digite a base e a largura do retangulo: ");
		System.out.println("Base: ");
		rectangle.width = leia.nextDouble();
		System.out.println("Altura: ");
		rectangle.height = leia.nextDouble();
		
		rectangle.area();
		rectangle.perimetro();
		rectangle.diagonal();
		
		System.out.printf("A area do ret�ngulo �: %.2f , o perimetro: %.2f e a diagonal: %.2f",rectangle.area(),rectangle.perimetro(),rectangle.diagonal());
	}
}
