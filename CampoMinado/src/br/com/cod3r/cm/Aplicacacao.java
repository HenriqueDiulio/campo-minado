package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Aplicacacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

		tabuleiro.abrir(3, 2);
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);

		System.out.println(tabuleiro);
	}

}
