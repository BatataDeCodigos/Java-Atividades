package Atividades;

import java.util.Scanner;

//Crie um programa que permita o usuário digitar dois valores e o operador, após retornar o valor conforme o tipo de calculo.
public class atv6 {

public static void main(final String[] args) {
    
Scanner ler = new Scanner(System.in);
int x, y;
int value = 0;
String oper;

System.out.printf("Escreva o primeiro valor: \n");
x = ler.nextInt();
System.out.printf("Escreva o segundo valor: \n");
y = ler.nextInt();
System.out.printf("Escreva o seu operador matemático: \n");
oper = ler.next();

switch (oper) {
    case "+":
    value = x + y;
        break;

    case "-":
    value =  x - y;
        break;

    case "*":
    value = x * y;
        break;

    case "/":
    if (y !=0) {
        value = x / y;
    }
    else{

        System.err.println("Erro! Divisão por zero não pode ser feita. Utilize outro número!");

    }
        break;

        default:

        System.err.println("Utilize operadores como: +(mais), -(menos), *(multiplicação), /(divisão)!");

        return;

}

System.out.printf("O valor será: %d \n", value);

}

}
