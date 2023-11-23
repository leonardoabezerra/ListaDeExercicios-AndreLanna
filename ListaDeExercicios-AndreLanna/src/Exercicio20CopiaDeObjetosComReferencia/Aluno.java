package Exercicio20CopiaDeObjetosComReferencia;

import javax.swing.JOptionPane;

public class Aluno {
      // Atributos
    String nome;
    float nota;

      // Construtor
    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

      // Método para criar uma cópia do objeto Aluno
    public static Aluno criarCopia(Aluno original) {
        // Cria um novo objeto Aluno com os mesmos valores do original
        Aluno copia = new Aluno(original.nome, original.nota);
        return copia;
    }

    public static void main(String[] args) {
          // Cria um objeto Aluno
        Aluno alunoOriginal = new Aluno("João", 8.5f);

          // Cria uma cópia do objeto Aluno
        Aluno alunoCopia = criarCopia(alunoOriginal);

          // Modifica a cópia
        alunoCopia.nome = "Maria";
        alunoCopia.nota = 9.0f;

        JOptionPane.showMessageDialog(null, "Objeto original:\n-> Nome: " + alunoOriginal.nome + "\n-> Nota: " + alunoOriginal.nota + "\n---------------------------\n" +
                                                            "Copia modificada:\n-> Nome: " + alunoCopia.nome + "\n-> Nota: " + alunoCopia.nota);

    }

}
    
    

