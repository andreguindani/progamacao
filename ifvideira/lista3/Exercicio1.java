package br.edu.ifvideira.lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cpf;
		int dep;
		double renda;
		double salarioMinimo;
		double desc = 0;
		double imposto;
		
		System.out.println("Qual o cpf do contribuinte: ");
		cpf = String.valueOf(in.nextLine());
		
		System.out.println("Qual o numero de dependentes: ");
		dep = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual a renda: ");
		renda = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o valor de salário minimo: ");
		salarioMinimo = Double.parseDouble(in.nextLine());
		
		//deconto
		if (dep == 1) {
			desc = 0.05;
		}
		else if (dep ==2) {
			desc = 0.1;
		}
		else if (dep >=3) {
			desc = 0.15;
		}
		
		//imposto
		if (renda <= (3*salarioMinimo)) {
			System.out.println("O contibuinte de cpf "+cpf+" está isento");
		}
		else if (renda <=(4*salarioMinimo)) {
			imposto = (renda * 0.05) - (desc * salarioMinimo);
			System.out.println("O contribuinte de cpf "+cpf+" vai pagar R$"+imposto);
		}
		else if (renda <=(6*salarioMinimo)) {
			imposto = (renda * 0.1) - (desc * salarioMinimo);
			System.out.println("O contribuinte de cpf "+cpf+" vai pagar R$"+imposto);
		}
		else if (renda <=(8*salarioMinimo)) {
			imposto = (renda * 0.15) - (desc * salarioMinimo);
			System.out.println("O contribuinte de cpf "+cpf+" vai pagar R$"+imposto);
		}
		else {
			imposto = (renda * 0.2) - (desc * salarioMinimo);
			System.out.println("O contribuinte de cpf "+cpf+" vai pagar R$"+imposto);
		}
		in.close();
	}
}
