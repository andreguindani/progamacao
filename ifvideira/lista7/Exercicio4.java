package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i;
		int tam;
		int soma=0;

		System.out.println("fale o tamanho do vetor: ");
		tam = Integer.parseInt(in.nextLine());
		int vet[] = new int[tam];
		for (i = 0; i<tam; i++) {
			vet[i] = i+1;
			if (vet[i]%2 ==0) {
				soma += vet[i];
			}
		}
		System.out.println("soma "+soma);

		in.close();
	}
}
