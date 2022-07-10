package br.com.charlespereira;

import java.util.Scanner;

public class ExemploConsole {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero");
		
		int result = s.nextInt();
		
		if(result ==11 && result >=10) {
			System.out.println("Olá, Charles Pereira");
		} else if(result <=10 && result == 10) {
			System.out.println("Olá, Charles Myller");
		} else {
			System.out.println("Olá, Charlie");
		}

	}

	}
