package entities;

public class Student {
	public String nome;
	public double nota1,nota2,nota3;
	
	public double nota()
	{
		return nota1+nota2+nota3;
	}
	public double faltando()
	{
		return 60.0 - nota();
	}
	
	
		
	
}
