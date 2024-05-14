package br.edu.ifvideira.lista1;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        double polegada;
        double milimetros;

        System.out.println("Digite uma quantidade de chuva em polegadas: ");
		polegada = Double.parseDouble(in.nextLine());

        milimetros = 25.4 * polegada;

        System.out.println("Chuva de " + milimetros + "mm");

        in.close();
	}
}
