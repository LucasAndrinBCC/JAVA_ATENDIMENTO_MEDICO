package com.operacao;

import java.time.LocalDate;

import com.pessoa.Medico;
import com.pessoa.Paciente;

public class Atendimento extends Operacao {
	
	private int prioridade;
	
	private int estado;
	
	private Paciente paciente;
	
	private Medico medico;
	
	public Atendimento(LocalDate inicio, LocalDate fim, int prioridade, int estado, Paciente paciente, Medico medico) {
		super(inicio, fim);
		this.prioridade = prioridade;
		this.estado = estado;
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void calculaPrioridade(boolean[] respostas) {
		int countTrue = 0;
		for (boolean resposta : respostas) {
			if (resposta) {
				countTrue++;
			}
		}
		setPrioridade(countTrue);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
	
}
