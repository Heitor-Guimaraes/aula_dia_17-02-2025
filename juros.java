package PrimeiraAula;

import java.util.Scanner;

public class juros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double valor, taxa, tempo, resultado;

		System.out.println("Me informe o valor da taxa");
		taxa = sc.nextDouble();

		System.out.println("Me informe o tempo em meses");
		tempo = sc.nextDouble();

		System.out.println("Me informe o valor da prestação");
		valor = sc.nextDouble();

		resultado = valor + (valor * (taxa / 100) * tempo);

		System.out.println("Seu valor final é de:" + String.format("%.2f", resultado));
	}

}
