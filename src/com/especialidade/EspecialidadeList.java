package com.especialidade;

import java.util.ArrayList;
import java.util.List;

public class EspecialidadeList {
	
	private List<Especialidade> especialidades = new ArrayList<Especialidade>();

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	
	public void addEspecialidade(Especialidade especialidade) {
		especialidades.add(especialidade);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EspecialidadeList [especialidades=");
		builder.append(especialidades);
		builder.append("]");
		return builder.toString();
	}
	
}
