package br.dev.Alex.tabuada.model;

import java.util.Scanner;

public class Menu {

	public void criarMenu() {
		
		Scanner leitor1 = new Scanner(System.in);
		Tabuada t1 = new Tabuada();
		
		System.out.print("Escolha o minimo multiplicador: ");
		double minimoMultiplicando = leitor1.nextDouble();
		t1.setMinimoMultiplicador(minimoMultiplicando);
		
		System.out.print("Escolha o minimo multiplicador: ");
		double maximoMultiplicando = leitor1.nextDouble();
		t1.setMaximoMultiplicador(maximoMultiplicando);
		
		System.out.print("Escolha o minimo multiplicador: ");
		double multiplicando = leitor1.nextDouble();
		t1.setMultiplicando(multiplicando);
		
		t1.mostrarTabuada();
		
	}
	
}
