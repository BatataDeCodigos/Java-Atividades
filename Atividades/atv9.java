package Atividades;
//Crie um programa que ao informar o número do mês ele escreva na tela o nome do mês informado.

import java.util.Scanner;

public class atv9 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o número do mês atual (1-12): \n");
        int numeromes = ler.nextInt();
        String nomemes;


        switch (numeromes) {
            case 1 -> nomemes = "Janeiro";
            case 2 -> nomemes = "Fevereiro";
            case 3 -> nomemes = "Março";
            case 4 -> nomemes = "Abril";
            case 5 -> nomemes = "Maio";
            case 6 -> nomemes = "Junho";
            case 7 -> nomemes = "Julho";
            case 8 -> nomemes = "Agosto";
            case 9 -> nomemes = "Setembro";
            case 10 -> nomemes = "Outubro";
            case 11 -> nomemes = "Novembro";
            case 12 -> nomemes = "Dezembro";
            default -> {
                nomemes = "Digite um número que tenha em meses!";
                throw new AssertionError();
            }
        }

        System.out.println("O número do mês: "+numeromes+", e seu nome é: "+nomemes+". :)");


    }
    
}
