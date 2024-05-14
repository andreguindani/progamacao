package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Diga um número: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga outro numero: ");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 > num2) {
			System.out.println("O número "+num1+" é maior que "+num2);
		}
		else if (num2 > num1) {
			System.out.println("O número "+num2+" é maior que "+num1);
		}
		else {
			System.out.println("Os números são iguais ");
		}
		in.close();
	}
}
