package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade[] = new int[5];
		int altura[] = new int [5];
		int i;
		
		for(i=0; i<5; i++) {
			System.out.println("Qual a idade");
			idade[i] = Integer.parseInt(in.nextLine());
			
			System.out.println("Qual a altura");
			altura[i] = Integer.parseInt(in.nextLine());
		}
		System.out.println("Idade na ordem ao contraria");
		for(i = idade.length - 1; i>=0; i--) {
			System.out.println(idade[i]);
		}
		System.out.println("Altura na ordem ao contraria");
		for(i = altura.length - 1; i>=0; i--) {
			System.out.println(altura[i]);
		}
	}
}
