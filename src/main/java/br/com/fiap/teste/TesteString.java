package br.com.fiap.teste;

import java.util.Scanner;

public class TesteString {
	
	/**
	 * Escreva um programa que recebe uma String e 
	 * faz a contagem da quantidade de vogais presentes
	 * nessa string.
	 */
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite a frase: ");
		String frase = tec.nextLine();
		//String frase = "Acabou a greve do metro";
		int contador = 0;
		String aux = frase.toLowerCase();
		
		for(int i = 0; i < frase.length(); i++) {
			char letra = aux.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
				contador++;
		}
		
		System.out.println(frase + " possui " + contador + " vogais");
	}

}
