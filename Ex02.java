//Fa�a um programa que calcule a cota��o do dolla e converta para Real//

package Lista_01;

  import java.util.Scanner;

	public class Ex02 {

		               public static void main(String[] args) {
			           Scanner entrada = new Scanner(System.in);
			           double cotacao_dolar, valor_dolar,valor_real;

			           System.out.println("Conversor de d�lar em real\n\n");

			    System.out.println("Digite a cota��o do dolar: ");
			    cotacao_dolar = entrada.nextDouble();

			    System.out.println("Digite o valor em dolar: ");
			    valor_dolar = entrada.nextDouble();

			    valor_real = cotacao_dolar * valor_dolar;

			    System.out.println("O Valor em reais � " + valor_real + "\n");
			        }
			}