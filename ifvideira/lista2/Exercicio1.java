package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe o número: ");
		num = Integer.parseInt(in.nextLine());
		
		if (num > 0) 
		{
			System.out.println("È positivo");
		}
		
		else if (num < 0) 
		{
			System.out.println("É negativo");
		}
		
		else
		{
			System.out.println("É zero");
		}
		
		in.close();
	}

}
