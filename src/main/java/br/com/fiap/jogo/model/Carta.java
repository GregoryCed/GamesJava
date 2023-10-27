package br.com.fiap.jogo.model;

public class Carta {

	private int valor;
	private Naipe naipe;
	
	public Carta(int valor, Naipe naipe) {
		super();
		this.valor = valor;
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}
	
	public String getImagem() {
		if (naipe == Naipe.COPAS) {
			return "h" + valor + ".png";
		}
		else if (naipe == Naipe.PAUS) {
			return "c" + valor + ".png";
		}
		else if (naipe == Naipe.ESPADAS) {
			return "s" + valor + ".png";
		}
		else {
			return "d" + valor + ".png";
		}
	}
	
	public String toString() {
		switch (valor) {
		case 1: 
			return "A " + naipe;
		case 11:
			return "J " + naipe;
		case 12:
			return "Q " + naipe;
		case 13:
			return "K " + naipe;
		default:
			return valor + " " + naipe;
		}
	}
}
