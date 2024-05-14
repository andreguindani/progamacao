package br.edu.ifvideira.lista5;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int cont = 0;
		int soma = 0;
		
		do {
			soma += cont;
			cont++;
		} while (cont <=100);
		System.out.println("A soma é:"+soma);
	}
}
