package CursosEAlunos.services;

import CursosEAlunos.model.Alunos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CadastrarAlunos {
    public static void cadastrarAluno(String aluno) throws IOException {

        var listaRecebida = ListarAlunos.listarAlunos(false);
        int lastId = 0;
        if( !listaRecebida.isEmpty()) {
             lastId = listaRecebida.get(listaRecebida.size() - 1).getIdAluno();
        }

        listaRecebida.add(new Alunos(lastId +1,aluno));
        String[] lines = new String[] { };
        String path = "C:\\Users\\Arnaldo\\Documents\\dbAlunos.txt";
        FileWriter fileWriter = new FileWriter(path);

        try (BufferedWriter bw= new BufferedWriter(fileWriter)){
            for(int x = 0; x < listaRecebida.size();x++) {
                bw.write(listaRecebida.get(x).getIdAluno()+","+listaRecebida.get(x).getNomealuno());
                bw.newLine();
            }
            System.out.println("Aluno cadastrado com sucesso!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
