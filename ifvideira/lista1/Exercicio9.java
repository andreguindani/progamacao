package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario;
		double reajuste;
		
		System.out.println("Digite o seu salário: ");
		salario = Double.parseDouble(in.nextLine());
		
		reajuste = salario * 1.2375;
		
		System.out.println("Seu salário com reajuste é de " + reajuste);
		
		in.close();
		
	}
}
