package br.edu.ifvideira.lista6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int idade;
		int i;
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		
		// comaça; onde termina; incremento
		for (i=0; i<15; i++) {
			System.out.println("Digite a idade da pessoa "+(i+1));
			idade = Integer.parseInt(in.nextLine());
			
			if (idade <= 15) {
				f1++;
			}
			else if (idade <= 30) {
				f2++;
			}
			else if (idade <= 45) {
				f3++;
			}
			else if (idade <= 60) {
				f4++;
			}
			else {
				f5++;
			}
			
		}
		System.out.println("Totall de pessoas na faixa 1"+f1+" - "+df.format((double)f1/i*100)+"%");
		System.out.println("Totall de pessoas na faixa 2"+f2+" - "+df.format((double)f2/i*100)+"%");
		System.out.println("Totall de pessoas na faixa 3"+f3+" - "+df.format((double)f3/i*100)+"%");
		System.out.println("Totall de pessoas na faixa 4"+f4+" - "+df.format((double)f4/i*100)+"%");
		System.out.println("Totall de pessoas na faixa 5"+f5+" - "+df.format((double)f5/i*100)+"%");
		
		in.close();
	}
}
