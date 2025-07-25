package Atividades;

import java.util.Scanner;

//Crie um programa pergunte o nome do aluno, suas 3 notas e a frequência, após calcular a média e informar se o aluno está aprovado ou reprovado, sendo que a média da escola é 6 e a frequência mínima é de 75%.
public class atv8 {

@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);

String nome;
int freq;
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
System.out.printf("Escreva o segundo valor: \n");
n4 = ler.nextInt();
System.out.printf("Diga a frequência em que o aluno vai às aulas em porcentagem (somente em número): \n");
freq = ler.nextInt();

media = (int) ((n2 + n3 + n4) / 3.0);


System.out.print("Aluno: "+nome+". A média das suas notas são: "+media+" com uma frequência nas aulas de "+freq+"%. <3 \n");

//verificação da porcentagem de falta
    if (media >= 6 && freq >=75){

        System.out.println("Aprovado! Tenha boas férias!");

    }
    else if (media < 6 && freq < 75){

        System.out.println("Reprovado! Boas férias e estude e venha nas aulas!");

    }
    else if (media > 6 && freq < 75){

        System.out.println("Reprovado por falta!");

    }
    else if (media < 6 && freq > 75){

        System.out.println("Reprovado por média. Estude mais!");

    }

ler.close();

}
}

