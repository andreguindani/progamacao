package br.edu.ifvideira.lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double canal4 = 0;
		double porcent4;
		double canal5 = 0;
		double porcent5;
		double canal7 = 0;
		double porcent7;
		double canal12 = 0;
		double porcent12;
		int canal;
		int pessoas;
		double total;
		
		do {
			System.out.println("Qual canal esta sendo assistido: 0 para finalizar \n"
					+ "4\n"
					+ "5\n"
					+ "7\n"
					+ "12\n"
					+ "0");
			canal = Integer.parseInt(in.nextLine());
			
			if (canal == 4) {
				System.out.println("Quantas pessoas estão assistindo a esse canal?");
				pessoas = Integer.parseInt(in.nextLine());
				canal4 += pessoas;
			}
			
			if (canal == 5) {
				System.out.println("Quantas pessoas estão assistindo a esse canal?");
				pessoas = Integer.parseInt(in.nextLine());
				canal5 += pessoas;
			}
			
			if (canal == 7) {
				System.out.println("Quantas pessoas estão assistindo a esse canal?");
				pessoas = Integer.parseInt(in.nextLine());
				canal7 += pessoas;
			}
			
			if (canal == 12) {
				System.out.println("Quantas pessoas estão assistindo a esse canal?");
				pessoas = Integer.parseInt(in.nextLine());
				canal12 += pessoas;
			}
			
			if (canal == 0) {
				break;
			}
			
		} while (2>1);
		total = canal12+canal4+canal5+canal7;
		porcent4 = (canal4/total)*100;
		porcent5 = (canal5/total)*100;
		porcent7 = (canal7/total)*100;
		porcent12 = (canal12/total)*100;
		
		System.out.println("A porcentagem de cada canal é:\n"
				+ "Canal 4 "+porcent4+"\n"
						+ "Canal 5 "+porcent5+"\n"
								+ "Canal 7 "+porcent7+"\n"
										+ "Canal 12 "+porcent12);
		in.close();
	}
}
