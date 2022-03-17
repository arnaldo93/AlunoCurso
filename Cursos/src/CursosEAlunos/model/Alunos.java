package CursosEAlunos.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alunos {
	private int idAluno;
	private String nomealuno;

	
	public Alunos(int idAluno, String nomealuno) {
		this.idAluno = idAluno;
		this.nomealuno = nomealuno;
	}

	public Alunos() {
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomealuno() {
		return nomealuno;
	}

	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}

	@Override
	public String toString() {
		return "Alunos [idAluno=" + idAluno + ", nomealuno=" + nomealuno + "]";
	}

	
}
