package controller;

import java.util.Scanner;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}
	
	public int valida_impar()
	{
		String num;
		int n;
		Scanner s = new Scanner(System.in);
		
		while(true)	{
			System.out.print("Digite um número ímpar positivo: ");
			num = s.nextLine();
			try {				
				n = Integer.parseInt(num);	
			} catch(Exception e) {
				System.out.println("Não é um número! Tente novamente!");
				continue;
			}
			if (n < 1) {
				System.out.println("O número deve ser maior ou igual a 1! Tente novamente!");
				continue;
			}
			if (n % 2 == 0) {
				System.out.println("O número deve ser ímpar! Tente novamente!");
				continue;
			}
			break;
		}
		s.close();
		return n;
	}
}
