package com.pessoa;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int calcularIdade() {
		LocalDate now = LocalDate.now();
		
		int age = now.getYear() - dataNascimento.getYear();
		
		if (now.getMonthValue() < dataNascimento.getMonthValue() || now.getMonthValue() == dataNascimento.getMonthValue() && now.getDayOfYear() < dataNascimento.getDayOfYear()) {
			age--;
		}
		
		return age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
}
