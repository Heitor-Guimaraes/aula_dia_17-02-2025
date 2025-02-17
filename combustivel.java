package PrimeiraAula;

import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double combustivel, km, tempo, velocidade, resultado, tempo_min;

		System.out.println("Me informe sua velocidade media");
		velocidade = sc.nextDouble();

		System.out.println("Me informe o tempo gasto na viagem em minutos");
		tempo_min = sc.nextDouble();

		tempo = tempo_min/60;
		
		km = tempo * velocidade;
		resultado = km / 12;

		System.out.println("Ele gastou  " + String.format("%.2f", resultado) + " litros" + ", ele percorreu "
				+ String.format("%.2f", km) + "km" + ", teve uma velocidade media de "
				+ String.format("%.2f", velocidade) + " km" + " e gastou " + String.format("%.2f", tempo)
				+ " horas na viagem");

	}

}
