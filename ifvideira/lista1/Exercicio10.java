package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double horas;
		double valorh;
		double percentualINSS;
		double salarioBruto;
		double salarioLiquido;
		
		System.out.println("Quantas horas você trabalha por semana?");
		horas = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o valor da hora por aula?");
		valorh = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o percentual do INSS atual?");
		percentualINSS = Double.parseDouble(in.nextLine());
		
		salarioBruto = horas * valorh;
		
		salarioLiquido = salarioBruto - (salarioBruto * (percentualINSS/100));
		
		System.out.println("Seu salário bruto é: R$" + salarioBruto);
		System.out.println("Seu salário líquido é: R$" + salarioLiquido);
		
		in.close();
	}
}
