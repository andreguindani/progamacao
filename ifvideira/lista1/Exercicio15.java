package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double distancia;
		double tempo;
		double velocidade;
		
		System.out.println("Qual o nome do piloto:");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual a distância percorrida:");
		distancia = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o tempo gasto:");
		tempo = Double.parseDouble(in.nextLine());
		
		velocidade = distancia / tempo;
		
		System.out.println("A velocidade média do "+nome+" foi "+velocidade+" km/h);");
		
		in.close();
	}
}
