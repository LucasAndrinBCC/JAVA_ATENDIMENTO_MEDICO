package com.operacao;

import java.util.ArrayList;
import java.util.List;

public class AtendimentoList {
	
	private List<Atendimento> atendimentos = new ArrayList<Atendimento>();

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	public void addAtendimento(Atendimento atendimento) {
		atendimentos.add(atendimento);
	}
	
}
