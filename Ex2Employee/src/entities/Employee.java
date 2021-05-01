package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	
	public double salarioLiquido()
	{
		return grossSalary - tax;
	}
	public void aumentoSalario(double porcentagem)
	{
		this.grossSalary = grossSalary +  grossSalary * porcentagem/100;
	}
	
	
	
}
