package Atividades;

import java.util.Scanner;
//Programa que permite digitar nome e idade, e mostrar as informações na tela
public class Atv1 {
    
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);
int x, y, soma; 

System.out.printf("Escreva o primeiro valor: \n");
x = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
y = ler.nextInt();

soma = x + y;

System.out.print("O valor somado será "+soma+". <3");
ler.close();

}

}
