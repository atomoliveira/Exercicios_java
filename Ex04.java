//Faça um programa que ao entra com nome diga o nome do usuario e mostre bem vindo//

package Lista_01;

import java.util.Scanner;

	public class Ex04 {

		public static void main(String[] args) {
		    Scanner myObj = new Scanner (System.in);
		    System.out.println("Entre com nome");

		    String userName = myObj.nextLine();
		    System.out.println("Seu nome de usuário é "+ userName);
		    System.out.println("Bem Vindo!!");
		    }
		}    
		
	