package entities;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	
	public double missingPoints() {
		if (notaFinal() <= 60.00 ) {
			return 60.0 - notaFinal();
	}
		else {
		return 0.0;
	}
	}
}
	
	
	
	


