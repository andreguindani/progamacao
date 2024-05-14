package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("Diga um número: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga outro número: ");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga mais um número: ");
		num3 = Double.parseDouble(in.nextLine());
		
		if ((num1>num2)&&(num1>num3)&&(num2>num3)) {
			System.out.println(num1 + num2);
		}
		else if ((num2>num1)&&(num2>num3)&&(num3>num2)) {
			System.out.println(num1+num3);
		}
		else {
			System.out.println(num2+num3);
		}
		in.close();
	}
}
