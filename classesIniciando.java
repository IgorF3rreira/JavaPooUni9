import java.util.*;
import java.lang.*;
import java.io.*;



    // classe base pessoa

    class Pessoa{
      private String nome;
      private int idade;

      public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
      }

      public String getNome(){
        return nome;
      }  
      public int getIdade(){
        return idade;
      }


      public void apresentar(){
        System.out.println("Nome: " + nome + " idade: " + idade + "");
      }
    }

    // classe Aluno para herdar de pessoa
    class Aluno extends Pessoa {
      
      private String curso;

      public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
      }

      public String getCurso(){
        return curso;
        
      }

      @Override
        public void apresentar(){
        super.apresentar();
        System.out.println("Curso: " + curso);
        }
    }
 
    
  // Classe professor que heerda de pessoa
      class Professor extends Pessoa{
        private String disciplina;

        public Professor(String nome, int idade, String disciplina){
          super(nome, idade);
          this.disciplina = disciplina;
        }

        public String disciplina(){
          return disciplina;
        }

        @Override
        public void apresentar(){
          super.apresentar();
          System.out.println("Disciplina: " + disciplina);
        }
      }


public class Main{
  public static void main(String[] args){
    Pessoa pessoa = new Pessoa("João", 30);
    System.out.println("\nApresentando Pessoa");
    pessoa.apresentar();

    Aluno aluno = new Aluno("Maria", 20 , "Engenharia");
    System.out.println("\nApresentando aluno");
    aluno.apresentar();

    Professor professor = new Professor("Carlos", 40, "Matemática");
    System.out.println("\nApresentando professor");
    professor.apresentar();
  }
}
