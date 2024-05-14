package br.edu.ifvideira.lista6;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int maior = 0;
		int menor = 999999999;
		int num = 0;
		
		for (;;) {
			System.out.println("Diga um número positivo: 0 para finalizar");
			num = Integer.parseInt(in.nextLine());
			
			if (num == 0) {
				break;
			}
			if (num > maior) {
				maior = num;
			}
			if ((num < menor) && (num > 0)) {
				menor = num;
			}
			
			if (num < 0) {
				System.out.println("Número negativos não serão considerados");
			}
		}
		System.out.println("O maior é "+maior+" e o menor é "+menor);
		
		in.close();
	}
}
