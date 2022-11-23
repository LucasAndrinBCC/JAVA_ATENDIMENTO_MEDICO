package com.pessoa;

import java.time.LocalDate;

import com.operacao.Atendimento;

public class Paciente extends Pessoa {
	
	private Atendimento atendimento;
	
	public Paciente(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}
	
	public Paciente(String nome, LocalDate dataNascimento, Atendimento atendimento) {
		super(nome, dataNascimento);
		setAtendimento(atendimento);
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [atendimento=");
		builder.append(atendimento);
		builder.append("]");
		return builder.toString();
	}

}
