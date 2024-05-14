package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetA [] = new int [10];
		int vetB [] = new int [10];
		int vetC [] = new int [20];
		int i;
		int j = 0;
		
		
		//recebimento
		System.out.println("Vetor A");
		for(i=0; i<10; i++) {
			System.out.println("Digite um valor para a posição "+(i+1));
			vetA [i] = Integer.parseInt(in.nextLine());
			
			
		}
		System.out.println("Vetor B");
		for(i=0; i<10; i++) {
			System.out.println("Digite um valor para a posição "+(i+1));
			vetB [i] = Integer.parseInt(in.nextLine());
		}
		
		
		
		//impressao
		System.out.println("Vetor A");
		for(i=0; i<10; i++) {
			System.out.print(vetA[i]+"  ");	
		}
		System.out.println("\nVetor B");
		for(i=0; i<10; i++) {
			System.out.print(vetB[i]+"  ");
		}
		
		//intercalação dos vetores A e B
		
		for(i=0; i<10; i++) {
			vetC[j] = vetA[i];
			j++;
			vetC[j] = vetB[i];
			j++;
		}
		//impressao C
		System.out.println("\nVetor C");
		for(i=0; i<20; i++) {
			System.out.print(vetC[i]+"  ");
		}
	}
}
