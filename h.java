package PrimeiraAula;

import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double comprimento,largura,altura,resultado;
		
		
		System.out.println("Me informe o comprimento" );
		comprimento = sc.nextDouble();
		
		System.out.println("Me informe a largura" );
		largura = sc.nextDouble();
	
		
		System.out.println("Me informe a altura" );
		altura = sc.nextDouble();
		
		resultado = comprimento*largura*altura;
		
		

		
		System.out.println("O volume é igual a" + resultado);
		
		
		
		
		

	}

}
