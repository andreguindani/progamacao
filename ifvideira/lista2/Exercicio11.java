package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sexo;
		double altura;
		double peso;
		
		System.out.println("Escola p sexp:\n"
				+ "1 - Feminino\n"
				+ "2 - Masculino");
		sexo = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		if (sexo == 1) {
			peso = (62.1 * altura) - 44.7;
		}
		else {
			peso = (72.7 * altura) - 58;
		}
		
		System.out.println("O peso ideal é: "+peso);
		
		in.close();
	}
}
