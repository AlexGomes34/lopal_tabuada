package br.dev.Alex.tabuada.ui;

import java.util.Scanner;

public class Menu {
	public void criarMenu() {
		Scanner leitor1 = new Scanner(System.in);
		System.out.print("Defina um multiplicando: ");
		double multiplicando = leitor1.nextDouble();
		
		Scanner leitor2 = new Scanner(System.in);
		System.out.print("Defina um minimo multiplicador: ");
		double minimoMultiplicador = leitor2.nextDouble();
		
		Scanner leitor3 = new Scanner(System.in);
		System.out.print("Defina um maximo multiplicador: ");
		double maximoMultiplicador = leitor3.nextDouble();
		
		
	}
}
