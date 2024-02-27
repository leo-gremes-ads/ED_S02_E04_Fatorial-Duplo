package view;

import controller.FatorialDuplo;
import controller.ValidaEntrada;

public class Principal
{
	public static void main(String[] args)
	{
		int n, fat;
		FatorialDuplo fd = new FatorialDuplo();
		ValidaEntrada ve = new ValidaEntrada();
		
		n = ve.valida_impar();
		fat = fd.fatorialDuplo(n);
		System.out.println("O fatorial duplo é: " + fat);
	}
}