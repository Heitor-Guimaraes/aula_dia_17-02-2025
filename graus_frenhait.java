package PrimeiraAula;

import java.util.Scanner;

public class graus_frenhait {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Fahrenheit, resultado;

		System.out.println("Me informe qnts graus quer converter");
		Fahrenheit = sc.nextDouble();

		resultado = ((Fahrenheit - 32) * 5) / 9;

		System.out.println("Sua conversão de gruas deu em: " + String.format("%.2f", resultado) + "C");

	}

}
