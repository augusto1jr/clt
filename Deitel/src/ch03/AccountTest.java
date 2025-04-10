package ch03;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", 5.00);
		
		System.out.print("Insira o valor que deseja depositar na primeira conta: ");
		double deposit1 = input.nextDouble();
		account1.deposit(deposit1);
		
		System.out.print("Insira o valor que deseja depositar na segunda conta: ");
		double deposit2 = input.nextDouble();
		account2.deposit(deposit2);
		
		
		System.out.printf("%s possui um saldo de: $%.2f %n", 
				account1.getName(), account1.getBalance());
		
		System.out.printf("%s possui um saldo de: $%.2f %n", 
				account2.getName(), account2.getBalance());
		
		input.close();
	}
	
}
