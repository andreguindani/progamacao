package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Digite o raio do cilindro:");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura do cilindro:");
		altura = Double.parseDouble(in.nextLine());
		
		area = 2 * Math.PI * raio * altura;
		
		System.out.println("A área do cilindro é: "+area);
		
		in.close();
	}
}
