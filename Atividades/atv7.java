package Atividades;

import java.util.Scanner;

//Crie um programa que pergunte o nome do aluno e 3 notas, após calcular a média e informar se o aluno está aprovado ou reprovado, sendo que a média da escola é 6.
public class atv7 {
    
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);

String nome;
int n2;
int n3;
int n4;
int media;


System.out.printf("Escreva o seu nome: \n");
nome = ler.nextLine();
System.out.printf("Escreva o primeiro valor: \n");
n2 = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
n3 = ler.nextInt();
System.out.printf("Escreva o terceiro valor: \n");
n4 = ler.nextInt();

media = (int) ((n2 + n3 + n4) / 3.0);

System.out.print("Seu nome é "+nome+". E a média das suas notas são: "+media+". <3");
ler.close();

}
}

