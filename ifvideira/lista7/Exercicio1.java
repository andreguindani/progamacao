package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numeros[] = new int [10];
		int i;
		int flag = 0;
		
		//recebimento
		for (i=0; i<10; i++) {
			System.out.println("Digite um valor para a posição: "+(i+1));
			numeros[i] = Integer.parseInt(in.nextLine());
		}
		//impressao do vetor
		System.out.println("Conteudo do vetor:");
		for (i=0; i<10; i++) {
			System.out.print(numeros[i]+"   ");
		}
		
		for(i=0; i<10; i++) {
			if (numeros[i] > 20) {
				if (flag == 0) {
					System.out.println("\nNumeros maiores que 20:");
				}
				System.out.println(numeros[i]);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("\nNenhum numero maior que 20 encontrado");
		}
		
	}
}
