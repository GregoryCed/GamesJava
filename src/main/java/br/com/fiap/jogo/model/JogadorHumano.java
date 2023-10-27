package br.com.fiap.jogo.model;

import javax.swing.JOptionPane;

public class JogadorHumano {
	
	private Carta[] mao;
	private int posVazia;
	private int pontos;
	
	public JogadorHumano(Carta c, Carta d) {
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
		int r = JOptionPane.showConfirmDialog(null, toString(), "Carta?", 0);
		if (r == 0)
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
