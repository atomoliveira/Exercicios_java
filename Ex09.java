//Faça um progra que calcule a taxa IMC e mostre se esta acima do peso//

package Lista_01;

import java.util.*;

public class Ex09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double peso, altura, pesoideal;
        
        System.out.printf("\n=====================\n");
        System.out.printf("    ~TAXA DE IMC~      "  );
        System.out.printf("\n=====================\n");
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();

		System.out.printf("Digite o sua altura: ");
		altura = ler.nextDouble();

		pesoideal = peso/(Math.pow(altura, 2));

		if(pesoideal < 19) {

			System.out.printf("\nFeminino: Abaixo do peso\n");
		}else if(19 <= pesoideal && pesoideal < 24) {

			System.out.printf("\nFeminino: Peso Ideal\n");

		}else if(pesoideal >= 24) {

			System.out.printf("\nFeminino: Acima do peso\n");

		}


		if(pesoideal < 20) 
		    {

			System.out.printf("\nMasculino: Abaixo do peso\n");
		}else if(20 <= pesoideal && pesoideal < 25) {

			System.out.printf("\nMasculino Peso Ideal\n");

		}else if(pesoideal >= 25) {

			System.out.printf("\nMasculino Acima do peso\n");

		}

    }

}
