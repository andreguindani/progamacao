//Transoformar graus kelvin em celsius

package br.edu.ifvideira.lista1;


import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double kelvin;
		double celsius;
		
		System.out.println("Quanto graus kelvin: ");
		kelvin = Double.parseDouble(in.nextLine());
		
		celsius = kelvin - 273.15;
		
		System.out.println("A temperatura é "+celsius+"°C");
		
		in.close();
	}
}
