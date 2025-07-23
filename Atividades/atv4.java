package Atividades;

import java.util.Scanner;

//Programa que permite digitar 2 valores multiplicando e mostrando na tela
public class atv4 {
    
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);
int x, y, mult; 

System.out.printf("Escreva o primeiro valor: \n");
x = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
y = ler.nextInt();

mult = x * y;

System.out.print("O valor multiplicado será "+mult+". <3");
ler.close();

}

}
