package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        System.out.println("Diga um número:");
        num = Integer.parseInt(in.nextLine());

        if (num%2==0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        in.close();
    }
}
