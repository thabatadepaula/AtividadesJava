package br.com.generation.telasamigaveis;

import java.util.Scanner;

// Exercício 2 - Thabata de Paula 


public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Digite o 1º número: ");
		n1 = numero.nextInt();
		
		System.out.print("Digite o 2º número: ");
		n2 = numero.nextInt();
		
		System.out.print("Digite o 3º número: ");
		n3 = numero.nextInt();
		
		if  (n1<n2) {
			if (n2<n3) {
				System.out.print(n1 + ","+ n2 + "," +n3);
	
			}
			else if (n1<n3) {
				System.out.print(n1 + "," + n3 + "," + n2);
			}
			else {
				System.out.print(n3 + "," + n1 + "," + n2);
			}
		}
		else if (n2<n3) {
			if (n1<n3 ) {
				System.out.print(n2 + "," + n1 + "," + n3);
			}
			else { 
				System.out.print(n2 + "," + n3 + "," + n1);
					
				}
			} 
		else {
			System.out.print(n1 + "," + n2 + "," + n3);
		}
		}}
		
		
	
