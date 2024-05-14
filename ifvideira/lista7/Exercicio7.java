package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double precos[] = new double[5];
		int codigo[] = new int[5]; 
		int i;
		int j;
		double aux;
		int auxCod;
		
		for(i=0; i<5; i++) {
			System.out.println("Digite um preço para a posição "+(i+1));
			precos[i] = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite o codigo para a posição "+(i+1));
			codigo[i] = Integer.parseInt(in.nextLine());
		}
		
//		System.out.println("\nVetor original");
//		for(i=0; i<5; i++) {
//			System.out.print(precos[i]+"   ");
//		}
		
		//ordenação
		for(j=0; j<4; j++) {
			for(i=0; i<4; i++) {
			
				if (precos[i] > precos[i+1]) {
					aux = precos[i];
					auxCod = codigo[i]; 
					precos[i] = precos[i+1];
					codigo[i] = codigo[i+1];
					precos[i+1] = aux;
					codigo[i+1] = auxCod;
				}
			}
		}
		
		System.out.println("\nOs 3 produtos com o maior preço");
		for(i=2; i<5; i++) {
			
			System.out.println("Código "+codigo[i]+" - R$"+precos[i]+"   ");
			
		}
	}
}
