package br.edu.ifvideira.lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double preço;
		double parcelas;
		double prestaçao;
		double total;
		
		System.out.println("Qual o preço a vista?");
		preço = Double.parseDouble(in.nextLine());
		
		System.out.println("Em quantas vezes será parcelado?\n"
				+ "3\n"
				+ "5\n"
				+ "0");
		parcelas = Double.parseDouble(in.nextLine());
		

		
		if (parcelas == 3) {
			total = preço+(preço*0.15);
			prestaçao = total/parcelas;
			System.out.println("O preço total será de R$"+total+" e ficara R$"+prestaçao+" por mês");
		}
		else if (parcelas == 5) {
			total = preço+(preço*0.3);
			prestaçao = total/parcelas;
			System.out.println("O preço total será de R$"+total+" e ficara R$"+prestaçao+" por mês");
		}
		else if (parcelas == 0) {
			System.out.println("O preço total será de R$"+preço);
		}
		else {
			System.out.println("Não pode ser feito nesse número de parcelas");
		}
		in.close();
	}
}
