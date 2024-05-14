package br.edu.ifvideira.lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double indicador;
		double raio;
		double area;
		double perimetro;
		
		System.out.println("Escolha o calculo:\n"
				+ "1 - Área\n"
				+ "2 - Perímetro");
		indicador = Double.parseDouble(in.nextLine());

		
		System.out.println("Diga o raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		if (indicador == 1) {
			area = Math.PI*Math.pow(raio, 2);
			System.out.println("A area da circunferencia é:"+area);
		}
		else if (indicador == 2) {
			perimetro = 2*Math.PI*raio;
			System.out.println("O perimetro da circunferencia é:"+perimetro);
		}
		else {
			System.out.println("O indicador de operação não existe");
		}
		in.close();
	}
}
