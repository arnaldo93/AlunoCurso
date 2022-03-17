package CursosEAlunos;

import CursosEAlunos.services.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

       int opcao = Menu.menu();

        do {

            switch (opcao) {

                case 1:
                    System.out.println("Cadastro de alunos");
                    CadastrarAlunos.cadastrarAluno(sc.next());
                    opcao = Menu.menu();
                    break;

                case 2:
                    System.out.println("Cadastro de Cursos");
                    CadastrarCursos.cadastrarCurso(sc.next());
                    opcao = Menu.menu();
                    break;
                case 3:
                    System.out.println("Listar Alunos");
                    ListarAlunos.listarAlunos(true);
                    opcao = Menu.menu();
                    break;
                case 4:
                    System.out.println("Listar Cursos");
                    ListarCursos.listarCursos(true);
                    opcao = Menu.menu();
                    break;
                case 5:
                    System.out.println("Listar Cursos");
                    System.out.println("Digite a matricula do aluno: \n");
                    int idAluno = sc.nextInt();
                    System.out.println("Digite o codigo do curso: \n");
                    int idCurso = sc.nextInt();
                    MatricularAlunos.matricularAluno(idAluno, idCurso);
                    opcao = Menu.menu();
                    break;
                case 6:
                    System.out.println("Digite a matricula do Curso");
                    int matricula = sc.nextInt();
                    ListarCursos.filtrarCursos(matricula);
                    opcao = Menu.menu();
                    break;

            }
        } while (opcao != 0);

    }

}
