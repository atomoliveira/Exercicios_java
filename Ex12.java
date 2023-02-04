//Faça um programa para mostrar a tabela da verdade//
package Lista_01;

public class Ex12 {

	public static void main(String[] args) {
		 boolean p, q;
		 System.out.println("p\tQ\tAND\tOR\tXOR\tNOT");
		 
		 p=true; q= true;
		 System.out.print(p +"\t" +q + "\t");
		 System.out.print((p&q) + "\t"+(p|q) +"\t");
		 System.out.println((p^q) +"\t"+(!p));
		 
		 p= true; q=false;
		 System.out.print(p+ "\t" + q+ "\t");
		 System.out.print((p&q)+ "\t" + (p|q)+ "\t");
		 System.out.println((p^q ) + "\t" + (!p));
		 
		 p= false; q= true;
		 System.out.print(p + "\t" + q +"\t");
		 System.out.print((p&q) + "\t" +(p|q) +"\t");
		 System.out.println((p^q) + "\t"+ (!p));
		 
		 p = false; q = false;
		 System.out.print(p + "\t" + q + "\t");
		 System.out.print((p&q) + "\t" + (p|q)+ "\t");
		 System.out.println((p^q) + "\t" + (!p));
	  }
  }	
		 
		


