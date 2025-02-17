package PrimeiraAula;

import java.util.Scanner;

public class conversao_de_graus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double graus, resultado;

		System.out.println("Me informe qnts graus quer converter");
		graus = sc.nextDouble();

		resultado = graus * 9 / 5 + 32;

		System.out.println("Sua conversão de gruas deu em: " + String.format("%.2f", resultado) + "F");

	}

}
