package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite nome do aluno: ");
				
		student.nome = sc.nextLine();
		System.out.println("Digite primeira nota: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Digite segunda nota: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Digite terceira nota: ");
		student.nota3 = sc.nextDouble();
		
		if (student.notaFinal()>60) {
		System.out.printf("Nota final = %.2f%n", student.notaFinal());
		System.out.println("Passou!");
		}
		else {
			System.out.printf("Nota final = %.2f%nReprovado!%n", student.notaFinal());
			System.out.printf("Faltando %.2f pontos.", student.missingPoints());
		}
			
		
		sc.close();
	}

}
