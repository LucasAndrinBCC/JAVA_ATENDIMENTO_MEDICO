package com.pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.especialidade.Especialidade;
import com.operacao.Atendimento;

public class Medico extends Pessoa {
	
	private List<Especialidade> especialidades = new ArrayList<Especialidade>();
	
	private List<Atendimento> atendimentos = new ArrayList<Atendimento>();
	
	public Medico(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	public void addAtendimentos(Atendimento atendimento) {
		atendimentos.add(atendimento);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidades=");
		builder.append(especialidades);
		builder.append(", atendimento=");
		builder.append(atendimentos);
		builder.append("]");
		return builder.toString();
	}
	
}
