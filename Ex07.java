//Faça um programa que calcule alcool ou gasolina, o que compensa mais //

package Lista_01;

import java.util.Scanner;
public class Ex07 {
	
	public static void main(String[] args) {
			// variaveis
			double alcool, gasolina;
			// objetos
			Scanner teclado = new Scanner(System.in);
			// entrada
			System.out.println("Álcool x Gasolina");
			System.out.print("Digite o valor do álcool: ");
			alcool = teclado.nextDouble();
			System.out.print("Digite o valor da gasolina: ");
			gasolina = teclado.nextDouble();
			// processamento + saida
			if (alcool < 0.7 * gasolina) {
				System.out.println("ABASTEÇA COM ÁLCOOL");
			} else {
				System.out.println("ABASTEÇA COM GASOLINA");
			}
			teclado.close();
		}
	}

	
}

	