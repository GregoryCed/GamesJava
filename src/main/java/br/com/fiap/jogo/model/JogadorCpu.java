package br.com.fiap.jogo.model;

import javax.swing.JOptionPane;

public class JogadorCpu {
	
	private Carta[] mao;
	private int posVazia;
	private int pontos;
	
	public JogadorCpu(Carta c, Carta d) {
		mao = new Carta[20];
		mao[0] = c;
		mao[1] = d;
		posVazia = 2;
		
		if (c.getValor() > 10)
			pontos = pontos + 10;
		else
			pontos = pontos + c.getValor();
		
		if (d.getValor() > 10)
			pontos = pontos + 10;
		else
			pontos = pontos + d.getValor();
	}

	public int getPontos() {
		return pontos;
	}
	
	public void adiciona(Carta c) {
		mao[posVazia] = c;
		posVazia++;
		if (c.getValor() > 10)
			pontos = pontos + 10;
		else
			pontos = pontos + c.getValor();
	}
	
	public boolean querCarta() {
		if (pontos < 15)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < posVazia; i++) {
			sb.append(mao[i]);
			sb.append(" ");
		}
		sb.append("\n");
		sb.append("Pontos: " + pontos);
		return sb.toString();
	}
	
}
