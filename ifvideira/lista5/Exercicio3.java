package br.edu.ifvideira.lista5;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int par = 0;
		int posit = 0;
		int cont = 0;
				
		do {
			System.out.println("Diga um número: ");
			num= Integer.parseInt(in.nextLine());
			
			if ((num %2) == 0) {
				par ++;
			}
			
			if (num >=0) {
				posit++;
			}
			cont ++;
			
		} while (cont <=4);
		
		System.out.println("A quantidade de par é:"+par);
		System.out.println("A quantidade de número positivos é: "+posit);
		
		in.close();
	}
}
