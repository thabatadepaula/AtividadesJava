package br.com.generation.telasamigaveis;
// exercício 1 - Thabata de Paula


import javax.swing.JOptionPane;

public class InteiroMaior {

	public static void main(String[] args) {
		int numero, num2, num3, maior; 
		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro:"));
		
		if((numero > num2 && numero>num3)) {
			maior = numero;
			JOptionPane.showMessageDialog(null, "O maior número é " + maior);
			
		}
		else if ((num2>numero && num2>num3)) {
			maior = num2;
			JOptionPane.showMessageDialog(null, "O maior número é " + maior);
		}
		else {
			maior = num3; 
			JOptionPane.showMessageDialog(null, "O maior número é " + maior);
	}
		

}


	}

