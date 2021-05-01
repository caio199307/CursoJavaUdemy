package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Employee employee = new Employee();
		double porcentagem;
		System.out.println("Olá, Digite seu nome: ");
		employee.name = leia.next();
		System.out.println("Digite seu salário bruto: ");
		employee.grossSalary = leia.nextDouble();
		System.out.println("Digite a taxa a ser cobrada: ");
		employee.tax = leia.nextDouble();
		
		employee.salarioLiquido();
		System.out.printf("Olá %s, seu salário é de: R$%.2f",employee.name,employee.salarioLiquido());
		System.out.println("\nDigite a porcentagem a ser acrescentada no salário bruto: ");
		porcentagem = leia.nextDouble();
		employee.aumentoSalario(porcentagem);
		employee.salarioLiquido();
		System.out.printf("Olá %s, seu salário atualizado é: %.2f",employee.name,employee.salarioLiquido());
		
	}
}
