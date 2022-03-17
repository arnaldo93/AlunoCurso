package CursosEAlunos.services;

import java.util.Scanner;

public class Menu {
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("|-------------MENU------------------|\n |____________________________|\n 1 Cadastrar Aluno|\n 2 Cadastrar Curso |\n 3 Listar Alunos|\n 4 Listar Cursos|\n 5 Matricular Aluno " +
                "|\n 6 Listar Alunos do Curso |\n 0 Sair|\n ____________________________ ");
        return opcao = sc.nextInt();

    }
}
