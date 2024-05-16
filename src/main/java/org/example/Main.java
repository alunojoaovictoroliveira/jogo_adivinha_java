package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;






        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                   |");
        System.out.println("|          Bem-vindo ao jogo de adivinhação         |");
        System.out.println("|                                                   |");
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------");
        System.out.println("|                 Regras do jogo                    |");
        System.out.println("|       1 - Vou pensar em um número                 |");
        System.out.println("|2 - Você tenta adivinhar qual número estou pensando|");
        System.out.println("|          3 - Te informo se acertou o não          |");
        System.out.println("|           Está pronto para jogar? (sim/não)       |");
        System.out.println("-----------------------------------------------------");
        pronto = leitura.next();

        switch (pronto){
            case "sim":
                resposta = 4;
                System.out.println("Qual número entre 0 a 10 estou pensando?");
                tentativa = leitura.nextInt();
                if(tentativa == resposta) {
                    System.out.println("parabéns, você acertou!");

                }else{
                    System.out.println("Que pena, você errou!");
                }

                break;
            case "não":
                System.out.println("Até mais,então.");
                break;
            default:
                System.out.println("Opção Inválida!");

        }

    }

    //Sistema super útil de bater palmas
    //bater_palma(15);

         //public static void bater_palma(int quantas) {
        // for (int i = 0; i <= quantas; i == ++) {
        //System.out.println("Clap");
          //  }
     // }

}