package br.com.fiap.jogo.model;

public class Jogo {

	public static void main(String[] args) {
		Baralho b = new Baralho();
		b.embaralha();
		
		Carta c = b.compra();
		Carta d = b.compra();
		JogadorHumano hum = new JogadorHumano(c, d);
		
		c = b.compra();
		d = b.compra();
		JogadorCpu cpu = new JogadorCpu(c, d);
		
		while(hum.querCarta()) {
			c = b.compra();
			hum.adiciona(c);
		}

		while(cpu.querCarta()) {
			c = b.compra();
			cpu.adiciona(c);
		}
		
		System.out.println(hum);
		System.out.println(cpu);
	}

}
