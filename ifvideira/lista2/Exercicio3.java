package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoAtual;
		int anoNascimento;
		int idade;
		
		System.out.println("Qual é o ano atual? ");
		anoAtual = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual é o ano de nascimento? ");
		anoNascimento = Integer.parseInt(in.nextLine());
		
		idade = anoAtual - anoNascimento;
		
		if (idade >= 16) {
			System.out.println("Poderá votar");
		}
		else {
			System.out.println("Não poderá votar");
		}
		in.close();
	}
}
