package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numeros[] = new int [20];
		int i;
		int flag = 0;
		
		for(i=0; i<20; i++) {
			System.out.println("Digite um numero para a posição "+(i+1));
			numeros[i] = Integer.parseInt(in.nextLine());
		}

		for(i=0; i<20; i++) {
			if (numeros[i] == 10) {
				if (flag == 0) {
					System.out.println("Posição dos numeros iguais a 10:");
				}
				System.out.println(i+1);
				flag = 1;
			}
		}
	}
}
