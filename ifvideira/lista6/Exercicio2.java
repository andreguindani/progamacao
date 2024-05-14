package br.edu.ifvideira.lista6;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int numneg = 0;
		int numpos = 0;
		int total = 0;
		
		for (;;) {
			System.out.println("Fale um número: 0 para finalizar");
			num = Integer.parseInt(in.nextLine());
			
			if (num < 0) {
			 numneg += num;
			}
			else if (num > 0) {
			numpos += num;
			}
			else {
				break;
			}
			
			total = numpos+numneg;
		}
		System.out.println("O total dos números positivos foi "+numpos);
		System.out.println("O total dos númeors negativos foi "+numneg);
		System.out.println("A soma total dos positivos e negativos foi "+total);
		
		in.close();
	}
}
