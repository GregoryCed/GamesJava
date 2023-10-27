package br.com.fiap.jogo.model;

import java.util.Random;

public class Baralho {
	
	private Carta[] monte;
	private int topo;
	
	public Baralho() {
		this.monte = new Carta[52];
		this.topo = 52;
		
		int i = 0;
		for(int valor = 1; valor <= 13; valor++) {
			monte[i++] = new Carta(valor, Naipe.OUROS);
			monte[i++] = new Carta(valor, Naipe.ESPADAS);
			monte[i++] = new Carta(valor, Naipe.COPAS);
			monte[i++] = new Carta(valor, Naipe.PAUS);
		}	
	}
	
	public void embaralha() {
		Random rand = new Random();
		for(int i = 0; i < 357; i++) {
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			Carta aux = monte[x];
			monte[x] = monte[y];
			monte[y] = aux;
		}		
	}			
			
	public Carta compra() {
		if (topo == 0)
			return null;
		else
			return monte[--topo];
	}

}
