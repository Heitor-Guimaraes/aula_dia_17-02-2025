package PrimeiraAula;

import java.util.Scanner;

public class calculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a, b, c, d, calc1, calc2, calc3, calc4, calc5, calc6, calc7, calc8, calc9, calc10, calc11, calc12;
		System.out.println("Me o valor de a");
		a = sc.nextDouble();

		System.out.println("Me o valor de b");
		b = sc.nextDouble();

		System.out.println("Me o valor de c");
		c = sc.nextDouble();

		System.out.println("Me o valor de d");
		d = sc.nextDouble();

		calc1 = a + b;
		calc2 = a + c;
		calc3 = a + d;
		calc4 = b + c;
		calc5 = b + d;
		calc6 = c + d;

		calc7 = a * b;
		calc8 = a * c;
		calc9 = a * d;
		calc10 = b * c;
		calc11 = b * d;
		calc12 = c * d;

		System.out.println("O resultado da adição um é" + calc1);
		System.out.println("O resultado da adição dois é" + calc2);
		System.out.println("O resultado da adição tres é" + calc3);
		System.out.println("O resultado da adição quatro é" + calc4);
		System.out.println("O resultado da adição cinco é" + calc5);
		System.out.println("O resultado da adição seis é" + calc6);
		System.out.println("O resultado da mutiplicação um é" + calc7);
		System.out.println("O resultado da mutiplicação dois é" + calc8);
		System.out.println("O resultado da mutiplicação tres é" + calc9);
		System.out.println("O resultado da mutiplicação quatro é" + calc10);
		System.out.println("O resultado da mutiplicação cinco é" + calc11);
		System.out.println("O resultado da mutiplicação seis é" + calc12);

	}

}
