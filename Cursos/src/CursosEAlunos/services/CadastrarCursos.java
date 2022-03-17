package CursosEAlunos.services;

import CursosEAlunos.model.Cursos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CadastrarCursos {
    public static void cadastrarCurso(String curso) throws IOException {

        var listaRecebida = ListarCursos.listarCursos(false);
        int lastId = 0;
        if( !listaRecebida.isEmpty()) {
            lastId = listaRecebida.get(listaRecebida.size() - 1).getIdCurso();
        }

        listaRecebida.add(new Cursos(lastId +1,curso));
        String[] lines = new String[] { };
        String path = "C:\\Users\\Arnaldo\\Documents\\dbCursos.txt";
        FileWriter fileWriter = new FileWriter(path);

        try (BufferedWriter bw= new BufferedWriter(fileWriter)){
            for(int x = 0; x < listaRecebida.size();x++) {
                bw.write(listaRecebida.get(x).getIdCurso()+","+listaRecebida.get(x).getNomeCurso());
                bw.newLine();
            }
            System.out.println("Curso cadastrado com sucesso!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

