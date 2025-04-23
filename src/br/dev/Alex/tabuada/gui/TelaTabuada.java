package br.dev.Alex.tabuada.gui;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.Alex.tabuada.model.Tabuada;

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
		tela.setSize(330, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		
		//Criação dos objetos que compoem a tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 100, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setText("");
		textMultiplicando.setBounds(230, 20, 70, 30);
		
		labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Minimo Multiplicador: ");
		labelMinimoMultiplicador.setBounds(20, 70, 150, 30);
		
		textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setText("");
		textMinimoMultiplicador.setBounds(230, 70, 70, 30);
		
		
		
		labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Maximo Multiplicador: ");
		labelMaximoMultiplicador.setBounds(20, 120, 150, 30);
		
		textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setText("");
		textMaximoMultiplicador.setBounds(230, 120, 70, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(20, 180, 130, 50);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(170, 180, 130, 50);
		
		listTabuada = new JList();
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 250, 280, 400);
		
		
		//Criamos o get para adquirir o painel de conteudo e adicionei o label no painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinimoMultiplicador);
		tela.getContentPane().add(textMaximoMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(scrollTabuada);
		
		
		//Adicionar listeners de evento aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada t1 = new Tabuada();
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				t1.setMultiplicando(multiplicandoDouble);
				
				String minimoMultiplicador = textMinimoMultiplicador.getText();
				double minimoMultiplicadorDouble = Double.valueOf(minimoMultiplicador);
				t1.setMinimoMultiplicador(minimoMultiplicadorDouble);
				
				String maximoMultiplicador = textMaximoMultiplicador.getText();
				double maximoMultiplicadorDouble = Double.valueOf(maximoMultiplicador);
				t1.setMaximoMultiplicador(maximoMultiplicadorDouble);
				
				String[] tabuadaResultado = t1.mostrarTabuada();
						
				listTabuada.setListData(tabuadaResultado);
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textMultiplicando.setText("");
				textMinimoMultiplicador.setText("");
				textMaximoMultiplicador.setText("");
				textMultiplicando.requestFocus();
				
				listTabuada.setListData(new String[0]);
				
				
				
			}
		});
		
		
		//Essa linha é a ultima do método
		tela.setVisible(true);
		
	}
	
}
