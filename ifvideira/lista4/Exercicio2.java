package br.edu.ifvideira.lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tab;
		int lim;
		int cont = 0;
		
		System.out.println("Qual a tabuada desejada:");
		tab = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual o limite para a tabuada:");
		lim = Integer.parseInt(in.nextLine());
		
		while(cont <= lim)
		{
			System.out.println(tab+" X "+cont+" = "+(tab*cont));
			cont ++;
		}
		in.close();
	}
}
