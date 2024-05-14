package br.edu.ifvideira.lista7;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tamanho;
		
		System.out.println("Quantos aluno ha na turma:");
		tamanho = Integer.parseInt(in.nextLine());
		
		String nomes[] = new String[tamanho];
		double nota;
		double maiorNota=0;
		double menorNota=11;
		int iMaior =0;
		int iMenor=0;
		int i;
		int j;
		
		for(i=0; i < tamanho; i++) {
			System.out.println("Qual o nome do aluno "+(i+1));
			nomes[i] = String.valueOf(in.nextLine());
			
			for (j=0; j<3; j++) {
				System.out.println("Qual a nota "+(j+1)+" do aluno "+nomes[i]);
				nota = Double.parseDouble(in.nextLine());
				
				if (nota > maiorNota) {
					maiorNota = nota;
					iMaior = i;
				}
				if (nota < menorNota) {
					menorNota = nota;
					iMenor = i;
				}
				
			}
		}
		System.out.println("A maior nota é "+maiorNota+" foi tirada por "+nomes[iMaior]);
		System.out.println("A maior nota é "+menorNota+" foi tirada por "+nomes[iMenor]);
		
	}
}
