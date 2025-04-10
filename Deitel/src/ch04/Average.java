package ch04;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;
		
		while (counter <= 2) {
			counter += 1;
			
			System.out.print("Insira a nota do aluno: ");
			int grade = input.nextInt();
			
			total += grade;
		}
		
		int media = total/(counter-1);
		System.out.printf("A média da turma é: %d%n", media);
		
		input.close();
	}
}
