package br.dev.Alex.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinimoMultiplicador;
	private JLabel labelMaximoMultiplicador;
	
	private JTextField textMultiplicando;
	private JTextField textMinimoMultiplicador;
	private JTextField textMaximoMultiplicador;
	
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	private JScrollPane scrollTabuada;
	
	private JList listTabuada;

	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarInterfaceTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		//Criação dos objetos que compoem a tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 100, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setText("");
		textMultiplicando.setBounds(190, 20, 50, 30);
		
		labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Minimo Multiplicador: ");
		labelMinimoMultiplicador.setBounds(20, 70, 150, 30);
		
		textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setText("");
		textMinimoMultiplicador.setBounds(190, 70, 50, 30);
		
		
		
		labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Maximo Multiplicador: ");
		labelMaximoMultiplicador.setBounds(20, 120, 150, 30);
		
		textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setText("");
		textMaximoMultiplicador.setBounds(190, 120, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(20, 180, 150, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(190, 180, 150, 30);
		
		
		
		
		//Criamos o get para adquirir o painel de conteudo e adicionei o label no painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinimoMultiplicador);
		tela.getContentPane().add(textMaximoMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		
		
		
		
		
		//Essa linha é a ultima do método
		tela.setVisible(true);
		
	}
	
}
