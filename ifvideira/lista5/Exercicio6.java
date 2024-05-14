package br.edu.ifvideira.lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int jg1 = 0;
	int jg2 = 0;
	int ponto;
	
	do {
		System.out.println("Placar atual:\n"
				+ "jogador 1: "+jg1+" pontos\n"
						+ "Jogador 2: "+jg2+" pontos \n"
								+ "Quem marcou o ponto\n"
								+ "1 - Jogador 1\n"
								+ "2 - Jogador 2\n");
		ponto = Integer.parseInt(in.nextLine());
		if (ponto == 1) {
			jg1++;
		}
		else if (ponto == 2) {
			jg2++;
		}
		else {
			System.out.println("Ponto mal fornecido");
		}
	} while (((jg1 < 11) || (jg1 <jg2 +2)) && ((jg2 < 11) || (jg2 <jg1 +2)));
	System.out.println("Placar final:\n"
			+ "Jogador 1 - "+jg1+" pontos\n"
					+ "Jogador 2 - "+jg2+" pontos");
	
	if (jg1 > jg2) {
		System.out.println("Jogador 1 venceu");
	}
	else {
		System.out.println("Jogador 2 venceu");
	}
	in.close();
}
}
