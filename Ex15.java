//Fa�a um programa que mostre a tabuada at� 20//

import java.util.*;
public class Ex15 {

	public static void main(String[] args) {

				Scanner ler = new Scanner(System.in);
				
			       
		        int num,t, i;
		       
		        System.out.printf("Digite um n�mero positivo: ");
		        num = ler.nextInt();
		        
		        while(num <= 0) {
		            System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
		            num = ler.nextInt();
		        
		        }
		        

			        for (i=0; i<=20; i++) {
			        	
			        	
			            t = num * i;
			            System.out.printf("\n%d X %d = %d", num, i, t);
			        }
			 }

		 }
	
	}

}
