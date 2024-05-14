package br.edu.ifvideira.lista6;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jog = 0;
		int times;
		int idade;
		double peso;
		int idadeTime = 0;
		double pesoTime = 0;
		int idadeTotal = 0;
		double pesoTotal = 0;
		
		for (times = 0; times < 40; times++) {
			System.out.println("Dados do time "+(times + 1));
			for (jog = 0; jog < 23; jog++){
				System.out.println("Qual o peso do jogador "+(jog+1));
				peso = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a idade do jogador "+(jog+1));
				idade = Integer.parseInt(in.nextLine());
				
				pesoTime += peso;
				idadeTime += idade;
				
				pesoTotal += peso;
				idadeTotal += idade;
			}
			System.out.println("Media de peso do time "+(times+1)+":"+((double)pesoTime/jog));
			System.out.println("Media de idade do time "+(times+1)+":"+((double)idadeTime/jog));
			
			pesoTime = 0;
			idadeTime = 0;
		}
		System.out.println("Media geral de peso: "+((double)pesoTotal/(times*jog)));
		System.out.println("Media geral de idade: "+((double)idadeTotal/(times*jog)));
	}
}
