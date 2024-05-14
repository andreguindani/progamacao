package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Qual é o raio do cone");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual é a altura do cone");
		altura = Double.parseDouble(in.nextLine());
		
		area = Math.PI * raio * altura;
		
		System.out.println("A area do cone é "+area);
		
		in.close();
	}
}
