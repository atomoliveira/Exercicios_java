//Faça um programa que converta de Celsius para Fahrenheits//

package Lista_01;

  import java.util.Scanner;
	 
	public class Ex05 {

	public static void main(String[] args) {

					Scanner entrada = new Scanner(System.in);
					double Celsius, Fahrenheit;

					System.out.println("Conversor de temperatura: Graus Celsius ->Fahrenheit\n\n");
					System.out.println("Digite a temperatura em Celsius: ");
					Celsius = entrada.nextDouble();

					Fahrenheit = ( 9 * Celsius + 160 ) / 5;
			                            System.out.println(" A medida convertida ºC " + Fahrenheit + "ºF");

				}

		}
	