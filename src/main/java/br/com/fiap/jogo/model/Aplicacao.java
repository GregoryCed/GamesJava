package br.com.fiap.jogo.model;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int r = JOptionPane.showConfirmDialog(null, "TESTE", "Carta?", 0);
		System.out.println(r);
		
		Carta c = new Carta(4, Naipe.PAUS);
		JOptionPane.showMessageDialog(null, c);
		c = new Carta(13, Naipe.OUROS);
		JOptionPane.showMessageDialog(null, c);
		
		
		UIManager.put("OptionPane.messageFont", 
				new	FontUIResource(new Font("Consola 0", 
						Font.PLAIN, 150)));
		
		String s = "\uD83C\uDCA1";
		String t = "\uD83C\uDCA2";
		JOptionPane.showMessageDialog(null, s + t);
		
	}

}
