package Atividades;

import java.util.Scanner;

// Programa que permite digitar 2 valores subtraindo e mostrando na tela
public class atv3 {
    
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);
int x, y, sub; 

System.out.printf("Escreva o primeiro valor: \n");
x = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
y = ler.nextInt();

sub = x - y;

System.out.print("O valor subtraído será "+sub+". <3");
ler.close();

}

}
