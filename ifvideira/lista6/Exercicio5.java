package br.edu.ifvideira.lista6;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sexo;
		int exp = 0;
		int idade;
		int mul = 0;
		int hom = 0;
		int menorIdExp = 999;
		double hom45 = 0;
		int mul35 = 0;
		int menorIdade = 999999;
		int homExp = 0;
		int idadeHomExp = 0;
		
		for (;;) {
			System.out.println("Qual a idade do candidato: 0 para finalizar");
			idade = Integer.parseInt(in.nextLine());
			
			System.out.println("Qual o sexo do candidato \n"
					+ "1 - Masculino \n"
					+ "2 - Feminino");
			sexo = Integer.parseInt(in.nextLine());
			
			System.out.println("O candidato tem experiencia \n"
					+ "1 - Sim \n"
					+ "2 - Não");
			
			if (idade == 0) {
				break;
				
				
			}
			
			if (sexo == 1) {
				hom++;
				if (idade <= 45) {
					hom45++;
				}
				if (exp ==1) {
					homExp += idade;
				}
				
			}
			else {
				mul++;
				if ((idade >= 35) &&(exp ==1)) {
					mul35++;
				}
			}
			if (idade > menorIdade) {
				idade = menorIdade;
			}
		}
		System.out.println("Numero de homens: "+hom);
		System.out.println("Numero de mulheres: "+mul);
		System.out.println("Numero de homens com exp: "+(homExp/hom));
		System.out.println("Porcentagem de homens com mais de 45 anos: "+((double)hom45/hom*100)+"%");
		System.out.println("Numeros de mulheres com idade inferior a 35 "+mul35);
		System.out.println("Numero de idade entre as mulheres que ja tem experiencia no serviço"+(mul/menorIdade));
		
		
	}
}
