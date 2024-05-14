package br.edu.ifvideira.lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int neg=0;
		
		while (2 > 1)
		{
			System.out.println("Digite um número: 0 para finalizar");
			num = Integer.parseInt(in.nextLine());
			
			if (num == 0) {
				break;
			}
			
			if (num < 0) {
				neg++;
			}
		}
		System.out.println("Foram digitados "+neg+" números negativos");
		in.close();
	}
}
