package CursosEAlunos.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MatricularAlunos {

    public static void matricularAluno(int idAluno, int idcurso) throws IOException {
        var alunoEntregue = ListarAlunos.buscarAlunoPorId(idAluno);
        var cursoEntregue = ListarCursos.buscarCursoPorId(idcurso);

        if (String.valueOf(alunoEntregue.getIdAluno()) == null || alunoEntregue.getNomealuno() == null ||
                String.valueOf(cursoEntregue.getIdCurso()) == null || cursoEntregue.getNomeCurso() == null) {
            System.out.println("Curso ou aluno nao encontrado");
        } else {
            String associacao = alunoEntregue.getIdAluno() + "," + alunoEntregue.getNomealuno() + "," +
                    cursoEntregue.getIdCurso() + "," + cursoEntregue.getNomeCurso();

            var listaAGravar = listaAssociacao();
            listaAGravar.add(associacao);

            String path = "C:\\Users\\Arnaldo\\Documents\\dbAssociacao.txt";
            FileWriter fileWriter = new FileWriter(path);

            try (BufferedWriter bw = new BufferedWriter(fileWriter)) {
                for (int x = 0; x < listaAGravar.size(); x++) {
                    bw.write(listaAGravar.get(x));
                    bw.newLine();
                }

                System.out.println("Aluno: " + idAluno+" matriculado no curso: "+ idcurso);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> listaAssociacao() {
        String path = "C:\\Users\\Arnaldo\\Documents\\dbAssociacao.txt";
        BufferedReader br = null;
        FileReader fr = null;
        List<String> aRetornar = new ArrayList<>();

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {
                aRetornar.add(line);
                line = br.readLine();
            }
            return aRetornar;

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
