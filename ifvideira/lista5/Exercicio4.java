package br.edu.ifvideira.lista5;

public class Exercicio4 {
	public static void main(String[] args) {
		double pais1 = 90;
		double pais2 = 140;
		int anos = 0;
		
		do {
			pais1 *=1.035;
			pais2 *=1.01;
			anos++;
			
		} while (pais1 <= pais2);
		
		System.out.println("São necessario "+anos+" anos para o pais 1 passar o pais 2");
	}
}
