package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        double numeros1;
        double numeros2;
        double numeros3;
        double numeros4;
        double resultado;

        System.out.println("Digite um número: ");
		numeros1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número: ");
		numeros2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número: ");
		numeros3 = Double.parseDouble(in.nextLine());

        System.out.println("Digite mais um número: ");
		numeros4 = Double.parseDouble(in.nextLine());

        resultado = (numeros1 + numeros2 + numeros3 + numeros4)/4;
        System.out.println("A média dos 4 números são: " + resultado);

        in.close();
	}
}
