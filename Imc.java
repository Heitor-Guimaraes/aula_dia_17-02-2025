package PrimeiraAula;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double peso, altura, Imc;

		System.out.println("Me informe sua altura");
		altura = sc.nextDouble();

		System.out.println("Me informe seu peso");
		peso = sc.nextDouble();

		Imc = peso / (altura * altura);

		if (Imc <= 18.5) {

			System.out.println("Seu imc é de:" + String.format("%.2	f", Imc) + " vc esta mt abaixo do peso");

		}

		else if (Imc > 18.5 && Imc <= 24.9) {

			System.out.println("Seu imc é de:" + String.format("%.2f", Imc) + " vc esta no seu peso normal");

		}

		else if (Imc >= 25.0 && Imc <= 29.9) {

			System.out.println("Seu imc é de:" + String.format("%.2f", Imc) + " vc esta cm excesso de peso");

		}

		else if (Imc >= 30 && Imc <= 34.9) {

			System.out.println("Seu imc é de:" + String.format("%.2f", Imc) + " vc esta cm obesidade classe um ");

		}

		else if (Imc >= 35 && Imc <= 39.9) {

			System.out.println("Seu imc é de:" + String.format("%.2f", Imc) + " vc esta cm obesidade classe dois ");

		}

		else if (Imc >= 40) {

			System.out.println("Seu imc é de:" + String.format("%.2f", Imc) + " vc esta cm obesidade classe tres ");

		}

	}

}
