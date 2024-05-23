package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int)Math.round(Math.random()*10);
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
                jogo_for();





                break;
            case "não":
                System.out.println("Até mais,então.");
                break;
            default:
                System.out.println("Opção Inválida!");

        }


    }

    public static void jogo_for(){

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int)Math.round(Math.random()*10);
        int tentativa;

        for(int contador = 0;contador<10;contador++){

            System.out.println("Qual número entre 0 a 10 estou pensando?");
            tentativa = leitura.nextInt();
            if(tentativa == resposta) {

                System.out.println("--------------------------------------");
                System.out.println("|     🎉parabéns, você acertou!🎉    |");
                System.out.println("--------------------------------------");

            }else{
                System.out.println("-----------------------------------------");
                System.out.println("|       ❌ que peba, você errou!❌      |");
                System.out.println("|        ❌a resposta era "+resposta+"❌           |");
                System.out.println("-----------------------------------------");
            }

            resposta = (int)Math.round(Math.random()*10);
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