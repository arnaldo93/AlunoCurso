package CursosEAlunos.services;

import CursosEAlunos.model.Alunos;
import CursosEAlunos.model.Associacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ListarAlunos {
    public static List<Alunos> listarAlunos(Boolean print) {
        String path = "C:\\Users\\Arnaldo\\Documents\\dbAlunos.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            int id =0;
            Associacao associacao = new Associacao();

            while (line != null) {
                String[] parts = line.split(",");
                String ids = parts[0];
                String nomes = parts[1];
                if(print == true)System.out.println(line);
                associacao.getListaAlunos().add(new Alunos(Integer.valueOf(ids),nomes));
                line = br.readLine();
            }

            return associacao.getListaAlunos();

        }catch(IOException e){
            System.out.println("Error: "+ e.getMessage());

        }finally {
            try{
                if (br !=null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }

            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Alunos buscarAlunoPorId(int id){

        var listaRecebida = ListarAlunos.listarAlunos(false);

        for (int x = 0; x < listaRecebida.size();x++ ){
            if (listaRecebida.get(x).getIdAluno() == id){
                return listaRecebida.get(x);
            }
        }
        return null;
    }

}
