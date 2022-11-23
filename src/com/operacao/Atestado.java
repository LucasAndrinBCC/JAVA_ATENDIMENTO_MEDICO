package com.operacao;

import java.time.LocalDate;
import java.util.Random;

public class Atestado extends Operacao {
	
	private int cid;
	
	public Atestado(LocalDate inicio, LocalDate fim, int cid) {
		super(inicio, fim);
		setCid(cid);
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public static Atestado emitirAtestado(Atendimento atendimento) {
		Random rand = new Random();
		Atestado atestado = new Atestado(atendimento.getInicio(), atendimento.getFim(), rand.nextInt(0, 10000000));
		return atestado;
	}
	
}
