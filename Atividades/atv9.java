package Atividades;
//Crie um programa que ao informar o número do mês ele escreva na tela o nome do mês informado.

import java.util.Scanner;

public class atv9 {

    /**
     * @param args
     */
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.printf("Digite o número do mês atual (1-12): \n");
    int numeromes = ler.nextInt();
    String nomemes;


        switch (numeromes) {
            case 1:
            nomemes = "Janeiro";
            break;
            case 2:
            nomemes = "Fevereiro";
            break;
            case 3:
            nomemes = "Março";
            break;
            case 4:
            nomemes = "Abril";
            break;
            case 5:
            nomemes = "Maio";
            break;
            case 6:
            nomemes = "Junho";
            break;
            case 7:
            nomemes = "Julho";
            break;
            case 8:
            nomemes = "Agosto";
            break;
            case 9:
            nomemes = "Setembro";
            break;
            case 10:
            nomemes = "Outubro";
            break;
            case 11:
            nomemes = "Novembro";
            break;
            case 12:
            nomemes = "Dezembro";
            break;
            default:
                nomemes = "Digite um número que tenha em meses!";
                throw new AssertionError();
            }

            System.out.println("O número do mês: "+numeromes+", e seu nome é: "+nomemes+". :)");
            
        }
        
    }
    
