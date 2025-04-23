package br.dev.Alex.tabuada.model;

public class Tabuada {
	
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
		
	}
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
		
	}
	
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	public String[] mostrarTabuada() {
		
		double tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		
		String[] tabuada = new String[(int) tamanho];
		
		int indice = 0;
		
		while (minimoMultiplicador < maximoMultiplicador + 1) {
			
		double produto = multiplicando * minimoMultiplicador;
		

		tabuada[indice] = multiplicando + " X " + minimoMultiplicador + " = " + produto;
		
		minimoMultiplicador+=1; //++ incrementa + 1 algoritimo
		indice++;
		
	}
		return tabuada;
		
	}
}

