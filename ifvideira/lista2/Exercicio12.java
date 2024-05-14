package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int medida;
        double num;
        double metros;

        System.out.println("Digite '1' para converter para m2 e '2' para m3");
        medida = Integer.parseInt(in.nextLine());

        System.out.println("Digite o tamanho a ser convertido");
        num = Double.parseDouble(in.nextLine());

        if (medida==1) {
            metros = num*0.0001;
            System.out.println("Vai ser" + metros + "m quadrados");
        } else if (medida==2) {
            metros = num*0.000001;
            System.out.println("Vai ser" + metros + "m cúbicos");
        } else {
            System.out.println("Erro");
        }

        in.close();
	}
}
