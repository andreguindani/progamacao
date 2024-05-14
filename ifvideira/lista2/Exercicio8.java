package br.edu.ifvideira.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maca;
        double preco;

        System.out.println("Digite o número de maçãs");
        maca = Integer.parseInt(in.nextLine());
        
        if ((maca < 12)&&(maca>0))
        {
            preco = maca*0.3;
            System.out.println("R$"+preco);
        }
        
        else if (maca >= 12)
        {
            preco = maca*0.25;
            System.out.println("R$"+preco);
        }
        
        else
        {
            System.out.println("Erro");
        }

        in.close();
        
    }
}
