package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import model.Calculator;
import java.awt.Color;
import javax.swing.JLabel;



public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Calculator calculadora = new Calculator();
	
	private JTextField firstField;
	private JTextField secondField;
	private JTextField resultField;
	private JTextField activeField;
	private String currentOperation;


	public Screen(JFrame frame) {
		setLayout(null);
		
		firstField = new JTextField();
		firstField.setBounds(20, 39, 86, 20);
		firstField.setBackground(new Color(255, 255, 255));
		firstField.setEditable(false);
		firstField.setColumns(10);
		add(firstField);

		secondField = new JTextField();
		secondField.setBounds(20, 81, 86, 20);
		secondField.setBackground(new Color(255, 255, 255));
		secondField.setEditable(false);
		secondField.setColumns(10);
		add(secondField);

		resultField = new JTextField();
		resultField.setBounds(20, 148, 86, 20);
		resultField.setBackground(new Color(255, 255, 255));
		resultField.setEditable(false);
		resultField.setColumns(10);
		add(resultField);

		
		firstField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				activeField = firstField;
			}
		});

		secondField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				activeField = secondField;
			}
		});

		activeField = firstField;
	
		
		// Botão 1
		JButton oneButton = new JButton("1");
		oneButton.setBounds(20, 193, 50, 50);
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "1");
			}
		});
		add(oneButton);

		// Botão 2
		JButton twoButton = new JButton("2");
		twoButton.setBounds(80, 193, 50, 50);
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "2");
			}
		});
		add(twoButton);

		// Botão 3
		JButton threeButton = new JButton("3");
		threeButton.setBounds(140, 193, 50, 50);
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "3");
			}
		});
		add(threeButton);

		// Botão 4
		JButton fourButton = new JButton("4");
		fourButton.setBounds(20, 254, 50, 50);
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "4");
			}
		});
		add(fourButton);

		// Botão 5
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(80, 254, 50, 50);
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "5");
			}
		});
		add(fiveButton);

		// Botão 6
		JButton sixButton = new JButton("6");
		sixButton.setBounds(140, 254, 50, 50);
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "6");
			}
		});
		add(sixButton);

		// Botão 7
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(20, 315, 50, 50);
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "7");
			}
		});
		add(sevenButton);
		
		// Botão 8
		JButton eightButton = new JButton("8");
		eightButton.setBounds(80, 315, 50, 50);
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "8");
			}
		});
		add(eightButton);

		// Botão 9
		JButton nineButton = new JButton("9");
		nineButton.setBounds(140, 315, 50, 50);
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "9");
			}
		});
		add(nineButton);

		// Botão 0
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(80, 376, 50, 50);
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = activeField.getText();
				activeField.setText(current + "0");
			}
		});
		add(zeroButton);

		// Botão CE
		JButton ceButton = new JButton("CE");
		ceButton.setBounds(20, 376, 50, 50);
		ceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstField.setText("");
				secondField.setText("");
				resultField.setText("");
				activeField = firstField;
			}
		});
		add(ceButton);
		
		// Botão de soma
		JButton additionButton = new JButton("+");
		additionButton.setBounds(200, 193, 50, 50);
		additionButton.addActionListener(e -> {
			currentOperation = "+";
			toggleActiveField();
		});
		add(additionButton);

		// Botão de subtração
		JButton subtractionButton = new JButton("-");
		subtractionButton.setBounds(200, 254, 50, 50);
		subtractionButton.addActionListener(e -> {
			currentOperation = "-";
			toggleActiveField();
		});
		add(subtractionButton);

		// Botão de multiplicação
		JButton productButton = new JButton("*");
		productButton.setBounds(200, 315, 50, 50);
		productButton.addActionListener(e -> {
			currentOperation = "*";
			toggleActiveField();
		});
		add(productButton);

		// Botão de divisão
		JButton divisionButton = new JButton("/");
		divisionButton.setBounds(200, 376, 50, 50);
		divisionButton.addActionListener(e -> {
			currentOperation = "/";
			toggleActiveField();
		});
		add(divisionButton);
			
		// Botão de resultado
		JButton resultButton = new JButton("=");
		resultButton.setBounds(140, 376, 50, 50);
		resultButton.addActionListener(e -> {
			try {
				double num1 = Double.parseDouble(firstField.getText());
				double num2 = Double.parseDouble(secondField.getText());
				double result = 0;

				switch (currentOperation) {
					case "+":
						result = calculadora.somar(num1, num2);
						break;
					case "-":
						result = calculadora.subtrair(num1, num2);
						break;
					case "*":
						result = calculadora.multiplicar(num1, num2);
						break;
					case "/":
						result = calculadora.dividir(num1, num2);
						break;
					default:
						resultField.setText("Op. inválida");
						return;
				}
				resultField.setText(String.valueOf(result));
			} catch (NumberFormatException ex) {
				resultField.setText("Erro");
			} catch (ArithmeticException ex) {
				resultField.setText("Erro");
			}
			activeField = firstField;
		});
		add(resultButton);
		
		JLabel resultadoLabel = new JLabel("Resultado");
		resultadoLabel.setBounds(20, 133, 65, 14);
		add(resultadoLabel);
		
		JLabel firstValueLabel = new JLabel("Valor #1");
		firstValueLabel.setBounds(20, 25, 65, 14);
		add(firstValueLabel);
		
		JLabel secondValueLabel = new JLabel("Valor #2");
		secondValueLabel.setBounds(20, 68, 65, 14);
		add(secondValueLabel);
	}
	
	private void toggleActiveField() {
	    if (activeField == firstField) {
	        secondField.requestFocus();
	        activeField = secondField;
	    } else {
	        firstField.requestFocus();
	        activeField = firstField;
	    }
	}
}
