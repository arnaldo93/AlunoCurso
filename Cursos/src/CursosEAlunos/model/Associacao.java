package CursosEAlunos.model;

import java.util.ArrayList;
import java.util.List;

public class Associacao {
	private int idAluno;
	private int idCurso;
	private List<Alunos>listaAlunos = new ArrayList<>();
	private List<Cursos>listaCursos = new ArrayList<>();
	
	
	public Associacao(int idAluno, int idCurso, List<Alunos> listaAlunos, List<Cursos> listaCursos) {
		super();
		this.idAluno = idAluno;
		this.idCurso = idCurso;
		this.listaAlunos = listaAlunos;
		this.listaCursos = listaCursos;
	}
	public List<Alunos> getListaAlunos() {
		return listaAlunos;
	}
	public void setListaAlunos(List<Alunos> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	public List<Cursos> getListaCursos() {
		return listaCursos;
	}
	public void setListaCursos(List<Cursos> listaCursos) {
		this.listaCursos = listaCursos;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public Associacao(int idAluno, int idCurso) {
		this.idAluno = idAluno;
		this.idCurso = idCurso;
	}
	public Associacao() {
		super();
	}
	@Override
	public String toString() {
		return "Associacao [idAluno=" + idAluno + ", idCurso=" + idCurso + ", listaAlunos=" + listaAlunos
				+ ", listaCursos=" + listaCursos + "]";
	}
	
	
}
