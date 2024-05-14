package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nota1;
		int nota2;
		int media;
		
		System.out.println("Qual é a nota 1: ");
		nota1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual é a nota 2 :");
		nota2 = Integer.parseInt(in.nextLine());
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("O aluno foi aprovado com a média "+media);
		}
		else if (media < 6) {
			System.out.println("O aluno foi reprovado com a média "+media);
		}
		in.close();
	}
}
