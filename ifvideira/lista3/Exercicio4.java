package br.edu.ifvideira.lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double totalcompra;
		int cliente;
		double valorfinal;
		double desconto;
		double valordesconto;

		System.out.println("Qual o valor total da compra?");
		totalcompra = Double.parseDouble(in.nextLine());

		System.out.println("Qual tipo de comprador vc é: \n"
				+ "1- Funcionário \n"
				+ "2- Cliente especial \n"
				+ "Outro valor - Cliente comum");
		cliente =  Integer.parseInt(in.nextLine());

		if (cliente == 1) {
			desconto =  0.1;
		}
		else if (cliente == 2) {
			desconto =  0.2;
		}
		else 	{
			desconto = 0;
		}
		valordesconto = totalcompra * desconto;
		valorfinal = totalcompra - valordesconto;
		System.out.println("O valor final da compra é: "+valorfinal);
		
		in.close();
	}
}
