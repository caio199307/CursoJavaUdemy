package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Digite o seu nome: ");
		student.nome = leia.next();
		System.out.println("Digite suas 3 notas consecutivamente: ");
		student.nota1 = leia.nextDouble();
		student.nota2 = leia.nextDouble();
		student.nota3 = leia.nextDouble();
		
		student.nota();
		
		if(student.nota() < 60)
		{
			System.out.printf("Ola %s,você não passou.\nVocê precisava de mais %.2f pontos para passar",student.nome,student.faltando());
		}
		else
		{
			System.out.printf("\nVocê passou.\nSua nota foi: %.2f",student.nota());
		}
		
		
		
	}
}
