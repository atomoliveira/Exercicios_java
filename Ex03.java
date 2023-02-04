//Faça um programa que ao entra com seu nome, mostre Bem vindo//
package Lista_01;

import java.util.Scanner;
	
	public class Ex03 {

	public static void main(String[] args) {
		    Scanner texto = new Scanner(System.in);
		      String str;
		    System.out.println("Entre com seu nome :");
		    str = texto.nextLine();
		    System.out.println(" Bem vindo "   +   str);

		    texto.close();
		  }
		}

		
