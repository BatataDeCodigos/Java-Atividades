public class Aluno {
    
//Definindo atributos
private String nome;
private int idade;
private double nota;

//construtor + métodos
public Aluno(String nome, int idade, double nota){

    this.nome = nome;
    this.idade = idade;
    this.nota = nota;

}

public void apresentar(){

System.out.println("Nome:"+nome+", idade:"+idade+" e nota:"+nota+". <3");

}

public void verificarApresentar(){

    if (nota >= 6.0){

        System.out.println("Aprovado com nota: "+nota+". <3");

    }
    else{

        System.out.println("Reprovado com nota: "+nota+". <3");

    }

}

//Getters + Setters
public String getNome(){
return nome;

}

public void setNome(String nome){
this.nome = nome;

}

public int getIdade(){
return idade;

}

public void setIdade(int idade){
this.idade = idade;

}

public double getNota(){
return nota;

}

public void setNota(double nota){
this.nota = nota;

}

//instanciando o objeto
public static void main(String[] args){

    Aluno aluno1 = new Aluno("João",18, "7.9");
    aluno1.apresentar();
    aluno1.verificarAprovacao();
    aluno1.setNome("Jurandir");
    aluno1.apresentar();
    aluno1.verificarAprovacao();


}

private void verificarAprovacao() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'verificarAprovacao'");
}

}
