package Atividades;

import java.util.Scanner;

//Crie um programa que pergunte o nome do aluno e 3 notas, após calcular a média e informar se o aluno está aprovado ou reprovado, sendo que a média da escola é 6.
public class atv7 {
    
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);
@SuppressWarnings("unused")   
int nome;
@SuppressWarnings("unused")
int n2;
@SuppressWarnings("unused")
int n3;
@SuppressWarnings("unused")
int n4;


System.out.print("Escreva o seu nome: \n");
nome = ler.nextInt();
System.out.printf("Escreva o primeiro valor: \n");
n2 = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
n3 = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
n4 = ler.nextInt();


System.out.print("Seu nome é"+nome+". E suas notas são:"+n2+", "+n3+", "+n4+". <3");
ler.close();

}

}
