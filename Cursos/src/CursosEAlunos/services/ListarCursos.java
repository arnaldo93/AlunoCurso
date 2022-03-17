package CursosEAlunos.services;

import CursosEAlunos.model.Alunos;
import CursosEAlunos.model.Associacao;
import CursosEAlunos.model.Cursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarCursos {
    public static List<Cursos> listarCursos(Boolean print) {
        String path = "C:\\Users\\Arnaldo\\Documents\\dbCursos.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            int id = 0;
            Associacao associacao = new Associacao();

            while (line != null) {
                String[] parts = line.split(",");
                String ids = parts[0];
                String nomes = parts[1];
                if (print == true) System.out.println(line);
                associacao.getListaCursos().add(new Cursos(Integer.valueOf(ids), nomes));
                line = br.readLine();
            }

            return associacao.getListaCursos();

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

    public static Cursos buscarCursoPorId(int id) {

        var listaRecebida = ListarCursos.listarCursos(false);

        for (int x = 0; x < listaRecebida.size(); x++) {
            if (listaRecebida.get(x).getIdCurso() == id) {
                return listaRecebida.get(x);
            }
        }
        return null;
    }
    public static List<Alunos> filtrarCursos(int idCurso){
        var listaCadastrada = MatricularAlunos.listaAssociacao();
        var listaARetornar = new ArrayList<Alunos>();

        for(int x= 0;x<listaCadastrada.size(); x++){

            String[] parts = listaCadastrada.get(x).split(",");
            String idAluno = parts[0];
            String nomeAluno = parts[1];
            String idCursos = parts[2];
            String nomeCurso = parts[3];

            if(idCursos.equals(String.valueOf(idCurso))){
                listaARetornar.add(new Alunos(Integer.valueOf(idAluno), nomeAluno));
            }


        }
        listaARetornar.forEach(System.out::println);
        return listaARetornar;
    }

}
