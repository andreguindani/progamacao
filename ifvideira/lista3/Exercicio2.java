package br.edu.ifvideira.lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double salarioAtual;
		double percentual;
		double salarioAumen;
		
		System.out.println("Qual o nome do funcionario: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual é o salario atual: ");
		salarioAtual = Double.parseDouble(in.nextLine());
		
		
		if (salarioAtual <= 500) {
			percentual = 0.1;
			salarioAumen = salarioAtual + (salarioAtual*percentual);
			System.out.println("O salario do "+nome+" ficou R$"+salarioAumen);
		}
		else if (salarioAtual <=700) {
			percentual = 0.15;
			salarioAumen = salarioAtual + (salarioAtual*percentual);
			System.out.println("O salario do "+nome+" ficou R$"+salarioAumen);
		}
		else if (salarioAtual <=1000) {
			percentual = 0.2;
			salarioAumen = salarioAtual + (salarioAtual*percentual);
			System.out.println("O salario do "+nome+" ficou R$"+salarioAumen);
		}
		else if (salarioAtual <=1500) {
			percentual = 0.05;
			salarioAumen = salarioAtual + (salarioAtual*percentual);
			System.out.println("O salario do "+nome+" ficou R$"+salarioAumen);
		}
		else if (salarioAtual <=2000) {
			percentual = 0.02;
			salarioAumen = salarioAtual + (salarioAtual*percentual);
			System.out.println("O salario do "+nome+" ficou R$"+salarioAumen);
		}
		else {
			System.out.println("O salario do "+nome+" fica igual");
		}
		in.close();
	}
}
