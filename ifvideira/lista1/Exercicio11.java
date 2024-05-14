package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double prestacao;
		double taxa;
		double atraso;
		double valor;
		
		System.out.println("Digite o valor da prestação: ");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a taxa de percentual de juros por dia: ");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o número de dias de atraso: ");
		atraso = Double.parseDouble(in.nextLine());
		
		valor = prestacao + (prestacao*(taxa/100)*atraso);
		
		System.out.println("A prestação em atraso é de " + valor);
		
		in.close();
	}
}
