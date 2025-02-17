package PrimeiraAula;

import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Double raio,altura,Pi,calculo;
		
		
		System.out.println("Me informe o raio" );
		raio = sc.nextDouble();
		
		System.out.println("Me informe o altura" );
		altura = sc.nextDouble();
		
		
		Pi = 3.14159;
		
		calculo = Pi * raio * raio * altura	;
		
		System.out.println("Seu volume é de:" + String.format("%.2f", calculo) );

		
	
	}

}
	