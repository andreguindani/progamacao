package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Diga um número: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga outro número: ");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 < num2) {
			System.out.println(num1+" , "+num2);
		}
		else {
			System.out.println(num2+" , "+num1);
		}
		in.close();
	}
}
