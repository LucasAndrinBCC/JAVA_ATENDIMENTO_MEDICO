package com.operacao;

import java.time.LocalDate;

public class Operacao {
	
	private LocalDate inicio;
	
	private LocalDate fim;
	
	public Operacao(LocalDate inicio, LocalDate fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFim() {
		return fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}
	
	public LocalDate tempoTotal() {
		int years = fim.getYear() - inicio.getYear();
		
		int fimMonthValue = fim.getMonthValue();
		int inicioMonthValue = inicio.getMonthValue();
		int fimDayOfYear = fim.getDayOfYear();
		int inicioDayOfYear = inicio.getDayOfYear();
		
		int months = fimMonthValue - inicioMonthValue;
		int days = fimDayOfYear - inicioDayOfYear;
		
		boolean minusDays = fim.getDayOfYear() < inicio.getDayOfYear();
		
		if (fimMonthValue < inicioMonthValue || fimMonthValue == inicioMonthValue && minusDays) {
			years--;
			months = inicioMonthValue - fimMonthValue;
			
			if (minusDays) {
				days = inicioDayOfYear - fimDayOfYear;
			}
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(years);
		builder.append("\\");
		builder.append(months);
		builder.append("\\");
		builder.append(days);
		
		LocalDate tempoTotal = LocalDate.parse(builder.toString());
		
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
	
}
