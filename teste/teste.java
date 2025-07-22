import java.util.Scanner;

class Calcular{
  public static void main(String[] args) {
     //trazendo a classe 
  Scanner ler = new Scanner(System.in);
  int x, y, soma;
    //dados
  System.out.printf("Informe o primeiro valor:");
  x = ler.nextInt();
  System.out.printf("Informe o segundo valor:");
  y = ler.nextInt();;
     //processo
  soma = x + y;
  //print
  System.out.print("O valor total será "+soma); 
  ler.close();
  
  }
  }


  