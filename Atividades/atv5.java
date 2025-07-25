package Atividades;

import java.util.Scanner;

// Programa que permite digitar 2 valores dividindo os valores e informar na tela o resultado
public class atv5 {
    
public static void main(String[] args) {
    
    try (Scanner ler = new Scanner(System.in)) {
        int x, y, div;
        System.out.printf("Escreva o primeiro valor: \n");
        x = ler.nextInt();
        System.out.printf("Escreva o segundo valor: \n");
        y = ler.nextInt();
        div = x / y;
        System.out.print("O valor multiplicado será "+div+". <3");
    }

}

}
