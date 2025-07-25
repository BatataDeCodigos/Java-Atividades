package Atividades;

import java.util.Scanner;
//Programa que permite digitar nome e idade, e mostrar as informações na tela
public class Atv1 {
    
public static void main(String[] args) {
    
    try (Scanner ler = new Scanner(System.in)) {
        String nome;
        int idade;
        
        System.out.printf("Escreva o seu nome: \n");
        nome = ler.next();
        System.out.printf("Escreva a sua idade: \n");
        idade = ler.nextInt();
        
        System.out.print("Nome do usuário: "+nome+". Sua idade é: "+idade+" <3");
    }

}

}
