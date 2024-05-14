package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura;
		double lateral;
		double base;
		double resultado;
		
		System.out.println("Qual é a altura do cubo");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a lateral do cubo");
		lateral = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a base do cubo");
		base = Double.parseDouble(in.nextLine());
		
		resultado = (altura*lateral)+(altura*base)+(lateral*base)*2;
		
		System.out.println("A area do cubo é "+resultado);
		
		in.close();
	}

}
