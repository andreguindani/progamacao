package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int timeA;
		int timeB;
        
        System.out.println("Quantos gols o time A fez?");
        timeA = Integer.parseInt(in.nextLine());

        System.out.println("Quantos gols o time B fez?");
        timeB = Integer.parseInt(in.nextLine());

        if (timeA>timeB) {
            System.out.println("Time A ganhou");
        } else if (timeB>timeA) {
            System.out.println("Time B ganhou");
        } else {
            System.out.println("Empate");
        }

        in.close();
	}
}
