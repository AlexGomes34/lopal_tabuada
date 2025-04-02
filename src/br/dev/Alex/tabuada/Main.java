package br.dev.Alex.tabuada;

import br.dev.Alex.tabuada.model.Tabuada;
import br.dev.Alex.tabuada.ui.Menu;

public class Main {

	public static void main(String[] args) {
	
		
		
		Menu m1 = new Menu();
		m1.criarMenu();
		
		Tabuada t1 = new Tabuada();
		t1.setMultiplicando(8);
		t1.setMinimoMultiplicador(4);
		t1.setMaximoMultiplicador(6);
		t1.mostrarTabuada();
	}

}
