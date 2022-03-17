package CursosEAlunos.model;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
	
	private int idCurso;
	private String nomeCurso;
	
	
	public Cursos(int idCurso, String nomeCurso) {
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
	}
	
	public Cursos() {
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	@Override
	public String toString() {
		return "Cursos [idCurso=" + idCurso + ", nomeCurso=" + nomeCurso + "]";
	}
	
}
